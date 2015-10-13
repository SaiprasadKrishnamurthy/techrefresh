package observerdesign.trigger;

import observerdesign.model.Trigger;

import java.util.Date;

/**
 * Trigger that represents the occurrence of a keyword in a file content.
 * Created by sai on 13/10/2015.
 */
public class FileKeywordTrigger implements Trigger {
    private final String fileName;
    private final String keyword;
    private final int lineNumber;
    private final Date createdDateTime;

    public FileKeywordTrigger(final String fileName, final String keyword, final int lineNumber) {
        this.fileName = fileName;
        this.keyword = keyword;
        this.lineNumber = lineNumber;
        this.createdDateTime = new Date();
    }

    @Override
    public Date createdDateTime() {
        return createdDateTime;
    }
}
