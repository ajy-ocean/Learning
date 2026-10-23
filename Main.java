public class Main {
    public static void main(String[] args) {
        int myDailyStudyHours = 2;
        int noOfDays = 7;
        int noOfWeeks = 4 * noOfDays;
        int studyHoursInAWeek = myDailyStudyHours * noOfDays;
        int studyHoursInWeeks = myDailyStudyHours * noOfWeeks;

        System.out.println("My daily study hours: " + myDailyStudyHours + " Hrs");
        System.out.println("In seven days my study hours: " + studyHoursInAWeek + " Hrs");
        System.out.println("In four weeks my study hours: " + studyHoursInWeeks + " Hrs");
    }
}