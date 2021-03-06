package model.constants;

public final class Constants {

    public static final String ADDRESS = "http://localhost:8080/";

    public static final String GET_USERS_BY_TOPIC = ADDRESS+"usersByTopic?topic=%s";

    public static final String SAVE_MESSAGE = ADDRESS+"message";

    public static final String UPDATE_USER = ADDRESS+"user";

    public static final String UPDATE_CHAT = ADDRESS+"chat";

    public static final String GET_CHAT_BY_ID = ADDRESS+"chatById?id=%d";

    public static final String GET_CHAT_BY_NAME = ADDRESS+"chatByName?name=%s";

    public static final String GET_USER_BY_ID = ADDRESS+"userById?id=%d";

    public static final String GET_USER_BY_NICKNAME = ADDRESS+"userByNickname?nickname=%s";

    public static final String GET_ALL_CHATS = ADDRESS+"chats";
}
