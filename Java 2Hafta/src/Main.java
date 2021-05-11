
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý", "C# + Angular", "Engin Demirog",
				"ÜCRETSÝZ");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý", "Java + React", "Engin Demirog",
				"ÜCRETSÝZ");
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Python, Java, C#", "Engin Demirog",
				"ÜCRETSÝZ");

		Course[] courses = { 
				course1, 
				course2, 
				course3 
		};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		System.out.println("----------");
		
		Author author1 = new Author(1,"Engine Demirog");
		
		Author[] authors = {
			author1	
		};
		
		for (Author author : authors) {
			System.out.println(author.author);
		}
		
		System.out.println("----------");
		
		CourseManger courseManager = new CourseManger();
		courseManager.detailOfProgram(course1);
		courseManager.applyToProgram(course1);
		
		courseManager.detailOfProgram(course2);
		courseManager.applyToProgram(course2);
	}

}
