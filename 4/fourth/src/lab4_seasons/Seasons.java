package lab4_seasons;

enum Season {
    Весна(15),
    Лето(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    Осень(10),
    Зима(0);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Seasons {
    public static void main(String[] args) {
        Season favoriteSeason = Season.Лето;
        System.out.println("Мое любимое время года: " + favoriteSeason);

        printSeasonInfo(Season.Лето);

        for (Season season : Season.values()) {
            System.out.println(season + ": Средняя температура " + season.getAverageTemperature() + "°C");
        }

        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAverageTemperature() + "°C, " + season.getDescription());
        }
    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }
}

