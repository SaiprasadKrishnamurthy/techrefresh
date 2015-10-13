package observerdesign.listener.file;

import observerdesign.model.Action;
import observerdesign.model.Listener;
import observerdesign.trigger.FileKeywordTrigger;

/**
 * Created by sai on 13/10/2015.
 */
public class FileKeywordListener implements Listener<FileKeywordTrigger> {

    // Callback for this trigger.
    private final Action<FileKeywordTrigger> fileKeywordTriggerAction;

    public FileKeywordListener(final Action<FileKeywordTrigger> fileKeywordTriggerAction) {
        this.fileKeywordTriggerAction = fileKeywordTriggerAction;
    }

    @Override
    public FileKeywordTrigger listen() {
        // Appropriate Implementation goes here (calls the action when the keyword is spotted in the file).
        return null;
    }

}
