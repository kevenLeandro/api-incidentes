package br.com.uol.dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.time.format.TextStyle;

public class DateTimeUtils {
    private ZoneId fusoHorarioDeSaoPaulo;

    final String ZONE = "America/Sao_Paulo";
    final String LOCALE_LANGUAGE = "pt";
    final String LOCALE_country = "br";

    private ZonedDateTime agoraEmSaoPaulo;
    private Locale locale;

    public DateTimeUtils() {
        this.fusoHorarioDeSaoPaulo = ZoneId.of(ZONE);
        this.agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
        this.locale = new Locale(LOCALE_LANGUAGE, LOCALE_country);
    }

    public String getDayName(int dayNumber) {
        return agoraEmSaoPaulo.plusDays(dayNumber).getDayOfWeek().getDisplayName(TextStyle.FULL,
                locale);
    }

    public int getDayMonth(int dayNumber){
        return agoraEmSaoPaulo.plusDays(dayNumber).getDayOfMonth();
    }

    public int getMonthNumber(int dayNumber){
        return agoraEmSaoPaulo.plusDays(dayNumber).getMonthValue();
    }

    public int getYear(int dayNumber){
        return agoraEmSaoPaulo.plusDays(dayNumber).getYear();
    }
}







