package observerdesign.model;

/**
 * Created by sai on 13/10/2015.
 */
public interface Action<T extends Trigger> {
    void onTrigger(T trigger);
}
