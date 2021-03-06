package David;

public class ProjectExceptions {

    public static class AccountException extends Exception{

        public AccountException(MyExceptionCodes code) {

            super(code.getMsg());

        }
    }

    public static class AddFriendException extends Exception{

        public AddFriendException(MyExceptionCodes code) {

            super(code.getMsg());

        }
    }
  public static class SuggestedFriendsException extends Exception {

      public SuggestedFriendsException(MyExceptionCodes code) {

          super(code.getMsg());
      }
  }
    public static class ShortestPathException extends Exception {

        public ShortestPathException(MyExceptionCodes code) {

            super(code.getMsg());
        }
    }

    public static class FollowSomeoneException extends Exception {
        public FollowSomeoneException(MyExceptionCodes code) {
            super(code.getMsg());


        }
    }

    public static enum MyExceptionCodes {
        WRONG_PASSWORD(0, "the password is wrong"),
        NO_ACCOUNT(1, "there is no an existing account with that name"),
        ACCOUNT_EXIST(2,"the account already exists"),
        ALREADY_FRIENDS(3,"already a friend"),

        ALREADY_FOLLWED(4,"already follwed"),

        NO_SUGGESTED_FRIENDS(5,"there's no Accounts to suggest"),
        NO_PATH_FOUND(6,"there's no path between these two users");




        private final int id;
        private final String msg;

        MyExceptionCodes(int id, String msg) {
            this.id = id;
            this.msg = msg;
        }

        public int getId() {
            return this.id;
        }

        public String getMsg() {
            return this.msg;
        }
    }
}

