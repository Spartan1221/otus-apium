package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatsPageFields {

    WORDS_WRITTEN("WORDS WRITTEN"),
    CURRENT_STREAK("CURRENT STREAK"),
    MAXIMUM_STREAK("MAXIMUM STREAK"),
    GRAMMAR_LESSONS_TAKEN("GRAMMAR LESSONS TAKEN"),
    WORDS_IN_VOCABULARY("WORDS IN VOCABULARY");

    private String value;
}
