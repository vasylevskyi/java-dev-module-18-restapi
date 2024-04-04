package ua.goit.restapi.notes.dto.update;

import lombok.Data;
import ua.goit.restapi.notes.Note;
import lombok.Builder;

@Builder
@Data
public class UpdateNoteResponse {
    private Error error;

    private Note updatedNote;

    public enum Error {
        ok,
        insufficientPrivileges,
        invalidNoteId,
        invalidTitleLength,
        invalidContentLength
    }

    public static UpdateNoteResponse success(Note updatedNote) {
        return builder().error(Error.ok).updatedNote(updatedNote).build();
    }

    public static UpdateNoteResponse failed(Error error) {
        return builder().error(error).updatedNote(null).build();
    }
}
