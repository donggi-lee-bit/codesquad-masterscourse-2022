# week1 알고리즘

## b1009 분산처리

```java
public class b1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = 1;

            for (int j = 0; j < b; j++) {
                res = a * res % 10;
                if (res == 0) {
                    res = 10;
                }
            }
            System.out.println(res);
        }
    }
}
```

<p>
총 데이터 개수 a, b는 a^b 형태로 주어진다. 마지막 데이터가 처리될 컴퓨터의 번호는 나머지 연산을 해서 나온 나머지 값이다. 나머지 연산을 했을 때 0이 나오면 0은 10으로 바꾸어 컴퓨터 번호 10이 출력될 수 있게 해준다.
</p>

<br>



## b1076 저항

```java
public class b1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long res = 0;

        for (int i = 0; i < 3; i++) {
            String str = sc.next();

            for (int j = 0; j < color.length; j++) {

                if (i == 0 && str.equals(color[j])) {
                    int ten = j * 10;
                    res = ten;
                }

                if (i == 1 && str.equals(color[j])) {
                    int one = j;
                    res += one;
                }

                if (i == 2 && str.equals(color[j])) {
                    long multiply = (long) Math.pow(10, j);
                    res *= multiply;
                }
            }
        }
        System.out.println(res);
    }
}
```

<p>
세번의 입력을 받는다. 첫번째 입력의 색이 위치한 인덱스 값에 10을 곱한다. 두번째 입력 색이 위치한 인덱스 값을 첫번째 값과 더해준다. 마지막 입력값이 위치한 인덱스만큼 10을 거듭제곱 계산한다. 첫번째 두번째 더한 값과 거듭제곱 계산한 값을 곱하여 반환한다.
</p>

<br>

