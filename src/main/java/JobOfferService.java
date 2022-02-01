import java.util.*;
import java.util.stream.Collectors;

public class JobOfferService {

    public JobOffer getBiggestSalary(List<JobOffer> jobOffers) {
        return null;
    }


    public long countInCity(List<JobOffer> jobOffers, String city) {
        return 0;
    }

    public Set<String> getCitiesSet(List<JobOffer> jobOffers) {
        return null;
    }

    public double getAverageMinExp(List<JobOffer> jobOffers) {
      return 0;
    }


    public String getMostPopularSkill(List<JobOffer> jobOffers) {
        return null;
    }

    public JobApplication getBestApplication(JobOffer jobOffer, List<JobApplication> jobApplications) {
        /*

        apkiacja najlepssza to taka;
        - jest albo z tego samegho miassta albo relocatePositive
        - pozadana pensja nie jest wieksza niz oferowana || jezeli ktos ma wszystkie skille pasujace to mozemy mu zaoferowac 120% pensji
        - exp nie jest mniejszy niz wymagany

        - poitem z listy szukamy najlepsza (
        1. najwięcej pasujących skili
        2. bierzemy tego, który chce mniej
        3. bierzemy kogoś, kto ma większe doświadczenie
        4. losowanie osoby spęłniających kryteria
         */


        return null;
    }


}