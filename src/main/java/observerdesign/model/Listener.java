package observerdesign.model;

/**
 * Created by sai on 13/10/2015.
 */
public interface Listener<T extends Trigger> {
    T listen();
}
