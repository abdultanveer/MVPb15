package b15.rjt.com.mvp.login;

import b15.rjt.com.mvp.data.TodoNote;

public interface LoginContract {
    interface View {
        void showToast();

        void showNote(TodoNote note);
    }

    interface Presenter {
        void onButtonClicked();

        void onLoginClicked(TodoNote note);
    }
}
