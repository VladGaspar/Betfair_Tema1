public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        User user1 = new User.UserBuilder(1,"Andrei",store,true,false)
                .setEmail("andrei123@yahoo.com")
                .setSex("M")
                .build();

        User user2 = new User.UserBuilder(2,"Alex",store,false,true)
                .setEmail("alexBoss@yahoo.com")
                .setPhoneNumber("0712345678")
                .build();

        User user3 = new User.UserBuilder(3,"Andreea",store,true,true)
                .setEmail("andreea.20@yahoo.com")
                .setSex("F")
                .setPhoneNumber("0712345678")
                .build();

        User user4 = new User.UserBuilder(4,"Maria",store,false,false)
                .setEmail("maria_maria@yahoo.com")
                .setSex("F")
                .setAdress("Cluj, str. Observatorului")
                .build();

        store.add(user1);
        store.add(user2);
        store.add(user3);
        store.add(user4);

        store.setReducere("Redcuere la cascaval 50%!");

    }
}