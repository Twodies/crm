package tm.payhas.crm.data.remote.api.request;

import java.util.ArrayList;

import tm.payhas.crm.domain.model.DataAttachment;

public class RequestCreateTask {

    private String name;
    private int executorId;
    private String description;
    private Integer authorId = null;
    private String priority;
    private String status = "notStarted";
    private Integer projectId = 0;
    private String reminderType;
    private ArrayList<String> remindAt;
    private String startsAt;
    private String finishesAt;
    private ArrayList<Integer> responsibleUsers;
    private ArrayList<Integer> observerUsers;
    private ArrayList<DataAttachment> files;
    private int id;

    public ArrayList<DataAttachment> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<DataAttachment> files) {
        this.files = files;
    }

    public int getExecutorId() {
        return executorId;
    }

    public void setExecutorId(int executorId) {
        this.executorId = executorId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getReminderType() {
        return reminderType;
    }

    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }

    public ArrayList<String> getRemindAt() {
        return remindAt;
    }

    public void setRemindAt(ArrayList<String> remindAt) {
        this.remindAt = remindAt;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getFinishesAt() {
        return finishesAt;
    }

    public void setFinishesAt(String finishesAt) {
        this.finishesAt = finishesAt;
    }

    public ArrayList<Integer> getResponsibleUsers() {
        return responsibleUsers;
    }

    public void setResponsibleUsers(ArrayList<Integer> responsibleUsers) {
        this.responsibleUsers = responsibleUsers;
    }

    public ArrayList<Integer> getObserverUsers() {
        return observerUsers;
    }

    public void setObserverUsers(ArrayList<Integer> observerUsers) {
        this.observerUsers = observerUsers;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
