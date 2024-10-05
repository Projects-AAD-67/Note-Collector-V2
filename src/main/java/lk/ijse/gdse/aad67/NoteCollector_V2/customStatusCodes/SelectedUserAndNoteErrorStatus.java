package lk.ijse.gdse.aad67.NoteCollector_V2.customStatusCodes;

import lk.ijse.gdse.aad67.NoteCollector_V2.dto.NoteStatus;
import lk.ijse.gdse.aad67.NoteCollector_V2.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
