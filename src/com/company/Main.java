package com.company;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course();
        Course course2 = new Course();
        course1.name = "Yazılım geliştirme";
        course2.name = "Java Kursu";

        String[] myList = {course1.name, course2.name};

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);


        }
        CourseManager courseManager = new CourseManager();
        courseManager.newcourse(course1);


        Profil profile = new Profil();
        profile.name = "Tolga ANKUN";
        profile.adress = "Hadimkoy";

        System.out.println(profile.name);
        System.out.println(profile.adress);

        ProfilManager profilManager =  new ProfilManager();
        profilManager.newprofile(profile);






    }







}



