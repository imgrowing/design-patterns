package ch03_decorate;

import java.io.FilterInputStream;
import java.io.IOException;

public class LowerCaseInputStreamDecorator extends FilterInputStream {
    // 책에서는 상속으로 구현했으나, 여기서는 상속은 타입만 동일하게 가져가기 위해서 사용하고,
    // 구성요소를 감싸도록 함.
    // 실제로 감싸고 있는 구성요소(FilterInputStream)의 행동에 추가적인 행동을 더하도록 구현
    private FilterInputStream filterInputStream;

    public LowerCaseInputStreamDecorator(FilterInputStream inputStream) {
        super(inputStream);
        this.filterInputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int read = filterInputStream.read();
        return (read != -1) ? Character.toLowerCase((char) read) : read;
    }
}
