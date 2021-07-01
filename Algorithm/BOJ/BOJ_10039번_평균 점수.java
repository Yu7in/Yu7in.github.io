// BOJ_10039번_평균 점수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num < 40) {
				sum += 40;
			} else {
				sum += num;
			}
		}

		System.out.println(sum / 5);
	}
}
