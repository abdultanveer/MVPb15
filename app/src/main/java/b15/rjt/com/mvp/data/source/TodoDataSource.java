package b15.rjt.com.mvp.data.source;

import b15.rjt.com.mvp.data.TodoNote;
import b15.rjt.com.mvp.login.LoginPresenter;

public interface TodoDataSource {
    void saveNote(TodoNote note);

    void getNoteDb(onNoteLoadedCallback callback);

    interface onNoteLoadedCallback {
       void onNoteloaded(TodoNote note);
    }
}
