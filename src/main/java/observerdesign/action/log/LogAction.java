package observerdesign.action.log;

import observerdesign.model.Action;
import observerdesign.model.Trigger;

/**
 * Action that logs the trigger. Note that this is not specific to any triggers.
 * Created by sai on 13/10/2015.
 */
public class LogAction<T extends Trigger> implements Action<T> {

    @Override
    public void onTrigger(final Trigger trigger) {
        // Appropriate implementation goes here.
    }
}
