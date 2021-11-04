package Quastion.Fabrica.Patterns.AbstractFactory.Memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithhubRepo githhub = new GithhubRepo();

        System.out.println("Creating new project/ Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Savin to githyb");
        githhub.setSave(project.save());

        System.out.println("Update in proj ver to 1.1");

        System.out.println("Writng poor code...");
        Thread.sleep(5000);
        project.setVersionAndDate("ver to 1.1");
        System.out.println(project);
        System.out.println("somthing went wrong...");

        System.out.println("Roling back to Version 1.0");
        project.load(githhub.getSave());

        System.out.println("Proj after roolback");
        project.setVersionAndDate("Version 1.1.");
        System.out.println(project);
    }
}
