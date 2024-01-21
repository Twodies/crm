package tm.payhas.crm.domain.useCases;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import java.util.List;

import tm.payhas.crm.data.localdb.entity.EntityUserInfo;
import tm.payhas.crm.data.localdb.repository.RepositoryUser;

public class UseCaseUsers {

    public RepositoryUser repositoryUser;

    public LiveData<List<EntityUserInfo>> allUsers;
    private MutableLiveData<String> searchTextLiveData = new MutableLiveData<>();

    public String searchText = "";

    public UseCaseUsers(Context context) {
        repositoryUser = new RepositoryUser(context);
        setSearchText("");
        allUsers = Transformations.switchMap(searchTextLiveData, searchText -> {
            Log.e("UseCase", "getAllUsers: " + searchText);
            return repositoryUser.getAllUsers(searchText);
        });
    }

    public LiveData<List<EntityUserInfo>> getAllUsers() {
        return allUsers;
    }

    public void setSearchText(String searchText) {
        searchTextLiveData.setValue(searchText);
    }

    public void connectAndUpdate() {
        repositoryUser.fetchAndInsertUsers();
    }

    public void addNewMessageCount(int userId) {
        repositoryUser.addNewMessageCount(userId);
    }

    public EntityUserInfo getOneUserInfo(int userId) {
        return repositoryUser.getOneUser(userId);
    }

    public void insertUser(EntityUserInfo user) {
        repositoryUser.insertUser(user);
    }

    public void deleteUser(EntityUserInfo user) {
        repositoryUser.deleteUser(user);
    }

    public void updateUser(EntityUserInfo user) {
        repositoryUser.updateUser(user);
    }

    public void deleteAllUsers() {
        repositoryUser.deleteAllUsers();
    }

    public void updateUserStatus(int userId, boolean isActive, String lastActivity) {
        repositoryUser.updateUserActivity(userId, isActive, lastActivity);
    }

    public void resetMessageCountForUser(int userId) {
        repositoryUser.resetMessageCountForUser(userId);
    }

    public void setMessageRoomText(String text, int userId, Integer roomId, String createdAt) {
        repositoryUser.setMessageRoomText(text, userId, roomId, createdAt);
        Log.e("UPDATE ROOM", "setMessageRoomText: " + text + "/" + userId + "/" + roomId + "/" + createdAt);
    }

    public LiveData<Integer> getRoomIdForUser(int userId) {
        return repositoryUser.getRoomIdByUserId(userId);
    }

}