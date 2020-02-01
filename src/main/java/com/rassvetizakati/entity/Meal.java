//package com.rassvetizakati.entity;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//@Entity
//public class Meal {
//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    private int id;
//
//    private String mealName;
//    //тип данных фото
//    private String mealPhoto;
//    private String mealDescription;
//    private float mealPrice;
//
//    public Meal(String mealName, String mealPhoto, String mealDescription, float mealPrice) {
//        this.mealName = mealName;
//        this.mealPhoto = mealPhoto;
//        this.mealDescription = mealDescription;
//        this.mealPrice = mealPrice;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getMealName() {
//        return mealName;
//    }
//
//    public void setMealName(String mealName) {
//        this.mealName = mealName;
//    }
//
//    public String getMealPhoto() {
//        return mealPhoto;
//    }
//
//    public void setMealPhoto(String mealPhoto) {
//        this.mealPhoto = mealPhoto;
//    }
//
//    public String getMealDescription() {
//        return mealDescription;
//    }
//
//    public void setMealDescription(String mealDescription) {
//        this.mealDescription = mealDescription;
//    }
//
//    public float getMealPrice() {
//        return mealPrice;
//    }
//
//    public void setMealPrice(float mealPrice) {
//        this.mealPrice = mealPrice;
//    }
//    //
//    //    @ManyToMany(mappedBy = "students")
//    //    private List<Event> events = new ArrayList<>();
//    //
//    //    @ManyToOne
//    //    @JoinColumn
//    //    private University university;
//    //
//    //    public int getId() {
//    //        return id;
//    //    }
//    //
//    //    public void setId(int id) {
//    //        this.id = id;
//    //    }
//    //
//    //    public String getStudentName() {
//    //        return studentName;
//    //    }
//    //
//    //    public void setStudentName(String studentName) {
//    //        this.studentName = studentName;
//    //    }
//    //
//    //    public int getStudentAge() {
//    //        return studentAge;
//    //    }
//    //
//    //    public void setStudentAge(int studentAge) {
//    //        this.studentAge = studentAge;
//    //    }
//    //
//    //    public List<Event> getEvents() {
//    //        return events;
//    //    }
//    //
//    //    public void setEvents(List<Event> events) {
//    //        this.events = events;
//    //    }
//    //
//    //    public University getUniversity() {
//    //        return university;
//    //    }
//    //
//    //    public void setUniversity(University university) {
//    //        this.university = university;
//    //    }
//}
