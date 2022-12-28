public class Main {

    /*
            Билет №5. Задача
    Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
    "Название книги" И.О. Автора
*/
   public static void main(String [] args) {

            String [] strBooks = new String [] {"Война и мир","Л.Н. Толстой","Евгений Онегин","А.С. Пушкин","Нос","Н.В. Гоголь"};
       for (int i = 0; i < strBooks.length-1; i+=2) {
           System.out.println("\""+strBooks[i]+"\" "+strBooks[i+1]);
       }
    }
}