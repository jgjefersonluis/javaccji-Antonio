package unidade2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupApp {

	public static void main(String[] args) throws IOException {
		Path home = Paths.get("C:/JefersonWorkSpace2020/java/ccji-antonio/Projetos/curso-ccji/2Disciplina/src/unidade2/backup");
		String filtro = "*.java";
		DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);
		for(Path p: stream)
		{
			Path txt = home.resolve(p);
			Path backup = home.resolve(p+ ".bak");
			Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING);
		}
	}

}
