package TaskTracker;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class TaskTracker {

    private static boolean loop =  false;
    private static int input;

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Task-Tracker");
        System.out.println("Choose any of the following options: ");

        while (loop != true){
        System.out.println(
                "1 - Show all the Tasks\n" +
                "2 - Show all the Comepleated Tasks" +
                "3 - List All the incomplete Tasks" +
                "4 - List the Task-In_Progress" +
                "5 - Add Task\n" +
                "6 - Update Task\n" +
                "7 - Delete Task" +
                "8 - Exit");
            input = scanner.nextInt();
        switch (input){
            case 1 -> showAll();
            case 2 -> allCompleted();
            case 3 -> allincompleted();
            case 4 -> allTaskInProgress();
            case 5 -> Add(jsonObject);
            case 6 -> Update();
            case 7 -> Delete();
            case 8 -> {
                System.out.println("thankyou for using");
                break;
            }
        }
        }
        scanner.close();
    }

    static void showAll(){}
    static void allCompleted(){}
    static void allincompleted(){}
    static void allTaskInProgress(){}

    static void Add(JSONObject jsonObject){
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");
    }

    static void Update(){}
    static void Delete(){}


}
