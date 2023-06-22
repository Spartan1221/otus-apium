package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StartPageHeaderData {

    FIRST_PAGE_HEADER("Chat to improve your English"),
    SECOND_PAGE_HEADER("Learn new words and grammar");

    private String header;
}
