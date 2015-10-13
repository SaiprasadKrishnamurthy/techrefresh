package observerdesign.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The singleton registry that binds the listeners and the actions together for the client to provide a consistent
 * API.
 * Created by sai on 13/10/2015.
 */
public final class Registry {


    private Map<Class<?>, Action<Trigger>> triggersAndActionsMapping = new HashMap<>();


    //create an object of Registry
    private static Registry instance = new Registry();

    //make the constructor private so that this class cannot be
    //instantiated
    private Registry() {
    }

    /**
     * Gets the instance of the registry.
     *
     * @return singleton instance of the registry.
     */
    public static Registry getInstance() {
        return instance;
    }

    /**
     * Registers an action class only when there is a need to explicitly call the action by passing in a trigger object.
     *
     * @param action      the action that needs to be performed.
     * @param triggerType the trigger type for which the action is supported
     * @return Registry for fluent API.
     */
    public Registry register(final Action<? extends Trigger> action, final Class<? extends Trigger> triggerType) {
        /* Coerce to a raw type, this is probably okay for now as this is done in a least scope of visibility. */
        triggersAndActionsMapping.put(triggerType, (Action) action);
        return this;
    }

    /**
     * Un registers an action class associated with a trigger.
     *
     * @param triggerType the trigger type for which the action is supported
     * @return Registry for fluent API.
     */
    public Registry unregister(final Class<? extends Trigger> triggerType) {
        /* Coerce to a raw type, this is probably okay for now as this is done in a least scope of visibility. */
        triggersAndActionsMapping.remove(triggerType);
        return this;
    }

    /**
     * Explicitly triggers the appropriate registered action for the given trigger
     *
     * @param trigger the trigger  for which the action is supported
     * @throws UnsupportedOperationException is thrown if there's no known actions registerd in the framework for this trigger.
     */
    public <T extends Trigger> void forceTrigger(final T trigger) {
        if (triggersAndActionsMapping.containsKey(trigger.getClass())) {
            triggersAndActionsMapping.get(trigger.getClass()).onTrigger(trigger);
        } else {
            throw new UnsupportedOperationException("No registered actions known for the trigger: " + trigger);
        }
    }


}
