package b15.rjt.com.mvp.login;

import b15.rjt.com.mvp.data.TodoNote;
import b15.rjt.com.mvp.data.source.TodoDataSource;
import b15.rjt.com.mvp.data.source.TodoRepository;

public class LoginPresenter implements  LoginContract.Presenter,
                            TodoDataSource.onNoteLoadedCallback{
    LoginContract.View view;
    TodoDataSource todoRepository;

    public LoginPresenter(LoginActivity loginActivity) {
        view = loginActivity;
        todoRepository = new TodoRepository();
    }

    @Override
    public void onButtonClicked() {
        todoRepository.getNoteDb(this);
       // view.showToast();
    }

    @Override
    public void onLoginClicked(TodoNote note) {
        //hey repo put this note in db[local/remote]
        todoRepository.saveNote(note);
    }

    @Override
    public void onNoteloaded(TodoNote note) {
        view.showNote(note);
    }
}
