public class User implements Observer {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String phoneNumber;
    private String email;
    private String adress;
    private Store store;
    private boolean enableNotificationEmail;
    private boolean enableNotificationPhone;

    private User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.adress = builder.adress;
        this.store = builder.store;
        this.enableNotificationEmail = builder.enableNotificationEmail;
        this.enableNotificationPhone = builder.enableNotificationPhone;
    }

    @Override
    public void update() {
        if (enableNotificationEmail && email != null)
            System.out.println("New Email notification for you, " + this.name + "! \n" + this.store.getNotifcation() + "\n");
        if (enableNotificationPhone && phoneNumber != null)
            System.out.println("New Phone notification for you, " + this.name + "! \n" + this.store.getNotifcation() + "\n");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public Store getStore() {
        return store;
    }

    public boolean isEnableNotificationEmail() {
        return enableNotificationEmail;
    }

    public boolean isEnableNotificationPhone() {
        return enableNotificationPhone;
    }


    public static class UserBuilder {
        private int id;
        private String name;
        private int age;
        private String sex;
        private String phoneNumber;
        private String email;
        private String adress;
        private Store store;
        private boolean enableNotificationEmail;
        private boolean enableNotificationPhone;

        public UserBuilder(int id, String name, Store store, boolean enableNotificationEmail, boolean enableNotificationPhone) {
            this.id = id;
            this.name = name;
            this.store = store;
            this.enableNotificationEmail = enableNotificationEmail;
            this.enableNotificationPhone = enableNotificationPhone;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
