package hoanglv.fpoly.lab06.ui.setting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SettingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is setting fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}