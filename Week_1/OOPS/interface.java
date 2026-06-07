public interface LibraryUser{
  void registerAccount();
  void requestBook();
}
public class KidUser implements LibraryUser{
  int age; 
String bookType;
  public void setAge(int age){
    this.age = age;
  }
  public void setBookType(String bookType){
    this.bookType = bookType;
  }
  @Override
  public void registerAccount(){
    if(age<12) {
      System.out.println("You have successfully registered under kids Account");
    }
    else{
      System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
  }
  @Override
  public void reguestBook(){
    if(bookType.equalsIgnoreCase("Kids")){
      System.out.println("Book issued successfully , please return the book within 10 days");
    }
    else{
      System.out.println("Oops , you are allowed to take only kids  books");
    }
  }
}
public class AdultUser implements LibraryUser {
  int age; String bookType;
  public void setAge(int age){
    this.age=age;
  }
  public void setBookType(String bookType){
    this.bookType = bookType;
  }
  @Override
  public void registerAccount(){
    if(age>12) {
      System.out.println("You have successfully registered under an Adult Account");
    }
    else{
      System.out.println(" Sorry, age must be  greater than 12 to register as an adult");
    }
  }
  @Override 
  public void requestBook(){
    if(bookType.equalsIgnoreCase("Fiction")){
      System.out.println("Book Issued successfully , please return the book within 7 days.");
    }
    else{
      System.out.println(Oops, you are allowed to take only adult fiction books.");
    }
  }
}
public class LibraryInterfaceDemo{
  public static void main(String[] args){
    KidUser kid1 = new KidUser();
    kid1.setAge(10);
    kid1.registerAccount();
    kid1.setBookType("Kids");
    kid1.requestBook();
    System.out.println();
    KidUser kid2 = new KidUser();
    kid2.setAge(18);
    kid2.registerAccount();
    kid2.setBookType("Fiction");
    kid2.requestBook();
    System.out.println();
    AdultUser adult1 = new AdultUser();
    adult1.setAge(5);
    adult1.registerAccount();
    adult1.setBookType("kids");
    adult1.requestBook();
    System.out.println();
    AdultUser adult2 = new AdultUdser(){
      adult2.setAge(23);
      adult2.registerAccount();
      adult2.setBookType("Fiction");
      adult2.requestBook();
    }
      }
