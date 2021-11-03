package personaldays13;

// 열거 타입 선언
// 열거 타입의 이름을 정하고 열거 타입 이름으로 소스파일.java 파일 생성
// 열거 타입 이름은 첫문자를 대문자 나머지는 소문자, 여러 단어라면 단어마다 첫문자 대문자
// 열거 상수 선언
// 열거 상수는 열거 타입의 값으로 사용 관례적으로 열거상수는 모두 대문자로 작성
// 여러단어라면 _ 로 연결 LOGIN_SUCCESS

public enum Week {
	MONDAY,
	TUESDAY,
	WENSEDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

// 변수선언
//Week today;
//Week reservationDay;
//
//Week today = Week.SUNDAY;
// 참조 타입이기에 null 저장됨
//Week birthday = null;

// 참조 타입 변수는 객체를 참조하는 변수
// 열거 상수는 열거 객체로 생성