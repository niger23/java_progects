package HomeWorks.HomeWorks011.UI;

import HomeWorks.HomeWorks011.Core.MVP.Presenter;

public class App {
    Presenter presenter;

    public App (Presenter presenter){
        this.presenter = presenter;
    }
    public void Open() throws Exception {
        presenter.mainMenu();
    }

}
