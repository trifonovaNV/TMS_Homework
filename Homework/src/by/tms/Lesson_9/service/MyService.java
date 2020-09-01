package by.tms.Lesson_9.service;

import java.util.Objects;

@Version(version = "2.0")
public class MyService {

    private String name;
    private int countOfUsers;

    public MyService() {
        name = "My Service";
        countOfUsers = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfUsers() {
        return countOfUsers;
    }

    public void setCountOfUsers(int countOfUsers) {
        this.countOfUsers = countOfUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyService myService = (MyService) o;
        return countOfUsers == myService.countOfUsers &&
                Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfUsers);
    }

    private void thisClassInfo() {
        System.out.println("Name of service: " + name + ", count of users: " + countOfUsers + ".");
        if (getClass().isAnnotationPresent(Version.class)) {
            System.out.println("Version annotation: " + getClass().getAnnotation(Version.class));
        }
    }
}
