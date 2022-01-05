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