package observerdesign.model;

import java.util.Date;

/**
 * A Generic Trigger (event) type.
 * Created by sai on 13/10/2015.
 */
public interface Trigger {

    /**
     * The date time in which the event or trigger was actually created.
     *
     * @return trigger created date time.
     */
    Date createdDateTime();

}
