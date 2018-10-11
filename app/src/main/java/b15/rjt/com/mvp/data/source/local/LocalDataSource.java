package b15.rjt.com.mvp.data.source.local;

import b15.rjt.com.mvp.data.TodoNote;
import b15.rjt.com.mvp.data.source.TodoDataSource;

public class LocalDataSource  implements TodoDataSource {
    @Override
    public void saveNote(TodoNote note) {
        //here is the actual saving of note in the db
    }

    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        //here i'll read it from local db and put the value back into callback
        //mimick hardcoded data as data from db
        TodoNote note = new TodoNote("note","subnote");
        callback.onNoteloaded(note);
    }
}
