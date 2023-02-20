# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 구현 목록

### 플레이어

- [x] 이름을 입력 받는다.
    - [x] 이름은 쉼표(',')를 기준으로 구분한다.
- [x] 여러 명의 플레이어를 생성한다.
    - [x] 플레이어는 2명 이상이여야 한다.
    - [x] 한 명의 플레이어를 생성한다.
        - [x] 플레이어의 위치는 입력 순이다.
        - [x] 플레이어의 이름으로 위치를 찾을 수 있다.
        - [x] 이름을 생성한다.
            - [x] 이름은 1글자 이상 5글자 이하여야 한다.
        - [x] 플레이어의 수를 반환한다.
        - [x] 플레이어들의 이름을 출력한다.

### 사다리

- [x] 사다리 높이를 입력 받는다.
- [x] 사다리를 생성한다.
    - [x] 라인을 생성한다.
        - [x] 좌,우 바가 겹치지 않아야 한다.
        - [x] 바를 생성한다.
            - [x] 건널 수 있는 바인지 확인한다.
- [x] 사다리를 출력한다.

### 사다리 게임

- [ ] 실행 결과를 입력 받는다.
- [ ] 사다리 게임을 실행한다
    - [ ] Line 만큼 반복한다
        - [ ] 움직일 수 있는 바가 있는지 확인한다.
        - [ ] 플레이어 기준 움직일 수 있는 바의 위치를 확인한다.
            - [ ] 플레이어 기준 왼쪽에 있으면 위치를 -1 한다.
            - [ ] 플레이어 기준 오른쪽에 있으면 위치를 +1 한다.
- [ ] 결과를 출력한다.
    - [ ] 사람 이름에 따라 결과를 출력한다.
    - [ ] `all`을 입력 받으면 전체 결과를 출력한다.
