package com.reindorius.util;

public class Constant {
    public static final String USER_SESSION = "USER_SESSION";
    //In case that if we are changing the value, we only need to do some changes here
    public static final USER vip1 = new USER("Reindorius", "VIP1");
    public static final USER vip2 = new USER("Sapientiam", "VIP2");
    public static final USER vip3 = new USER("some_user", "VIP3");


    public static class USER {
        private String username;
        private String rank;

        public USER(String username, String rank) {
            this.username = username;
            this.rank = rank;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public boolean equals(USER user) {
            return (this.getUsername().equals(user.getUsername()))
                    && (this.getRank().equals(user.getRank()));
        }

        @Override
        public String toString() {
            return "This is " + getUsername() + " of rank " + getRank();
        }
    }
}
