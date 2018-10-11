package b15.rjt.com.mvp.data.source;

import b15.rjt.com.mvp.data.TodoNote;
import b15.rjt.com.mvp.data.source.local.LocalDataSource;
import b15.rjt.com.mvp.login.LoginPresenter;

public class TodoRepository implements TodoDataSource {
    TodoDataSource localDataSource;

    public TodoRepository() {
            localDataSource = new LocalDataSource();
        }

    @Override
    public void saveNote(TodoNote note) {
        //mr local db put this note in db
        localDataSource.saveNote(note);
    }

    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        localDataSource.getNoteDb(callback);
    }


}
