public class UserManager extends User {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.geteMail()+" "+" user saved");
    }
    public void remove(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.geteMail()+" "+" user removed");
    }


}
