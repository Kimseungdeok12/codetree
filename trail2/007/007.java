import java.util.Scanner;

class Secret {
    String code;
        char point;
            int time;

                Secret(String code, char point, int time) {
                        this.code = code;
                                this.point = point;
                                        this.time = time;
                                            }
                                            }

                                            public class Main {
                                                public static void main(String[] args) {
                                                        Scanner sc = new Scanner(System.in);

                                                                String code = sc.next();
                                                                        char point = sc.next().charAt(0);
                                                                                int time = sc.nextInt();

                                                                                        Secret secret = new Secret(code, point, time);

                                                                                                System.out.println("secret code : " + secret.code);
                                                                                                        System.out.println("meeting point : " + secret.point);
                                                                                                                System.out.println("time : " + secret.time);
                                                                                                                    }
                                                                                                                    }