import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class E {
	private static void downloadUsingStream(String urlStr, String file) throws IOException{
		URL url = new URL(urlStr);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fis = new FileOutputStream(file);
		byte[] buffer = new byte[1024];
		int count=0;
		while((count = bis.read(buffer,0,1024)) != -1){
			fis.write(buffer, 0, count);
		}
		fis.close();
		bis.close();
	}
	private static void downloadUsingNIO(String urlStr, String file) throws IOException {
		URL url = new URL(urlStr);
		ReadableByteChannel rbc = Channels.newChannel(url.openStream());
		FileOutputStream fos = new FileOutputStream(file);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
	}
	public static int runcommand(String command) throws IOException{
		Process process=Runtime.getRuntime().exec(command);
		return process.exitValue();
	}
	public static void main(String[] args) {
		File launch = new File("SCLauncher.jar");
		if(!launch.exists()){
			try {
				String url = "http://downloads.swfworld.gq/files/SCLauncher.jar";
				downloadUsingNIO(url, "SCLauncher.jar");
				downloadUsingStream(url, "SCLauncher.jar");
			} catch (IOException e) {
				e.printStackTrace();
				}
			try {
				runcommand("java -jar SCLauncher.jar");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				runcommand("java -jar SCLauncher.jar");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


