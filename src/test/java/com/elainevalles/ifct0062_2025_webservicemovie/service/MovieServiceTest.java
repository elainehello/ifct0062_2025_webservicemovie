package com.elainevalles.ifct0062_2025_webservicemovie.service;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;
import com.elainevalles.ifct0062_2025_webservicemovie.repository.IMovieRepository;
import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieServiceTest {
    @Autowired
    MovieService movieService;

    @Autowired
    IMovieRepository iMovieRepository;

//    @Test
//    public void create() {
//        Movie movie1 = movieService.create(new Movie("tt9619825", "Echoes of the Future", "Nora Michaels", 2023));
//        Assertions.assertNotNull(movie1);
//
//        Movie movie2 = movieService.create(new Movie("tt9619826", "The Last Horizon", "Carlos Rivera", 2024));
//        Assertions.assertNotNull(movie2);
//
//        Movie movie3 = movieService.create(new Movie("tt9619827", "Neon Depths", "Akira Yamamoto", 2023));
//        Assertions.assertNotNull(movie3);
//
//        Movie movie4 = movieService.create(new Movie("tt9619828", "Whispers in Time", "Elena Petrova", 2025));
//        Assertions.assertNotNull(movie4);
//
//        Movie movie5 = movieService.create(new Movie("tt9619829", "The Silent Accord", "Mason King", 2022));
//        Assertions.assertNotNull(movie5);
//
//        Movie movie6 = movieService.create(new Movie("tt9619830", "Carbon Dreams", "Yasmin Al-Fayed", 2023));
//        Assertions.assertNotNull(movie6);
//
//        Movie movie7 = movieService.create(new Movie("tt9619831", "Starlight Protocol", "Rajiv Mehta", 2024));
//        Assertions.assertNotNull(movie7);
//
//        Movie movie8 = movieService.create(new Movie("tt9619832", "Voidwalker", "Sophie Lang", 2023));
//        Assertions.assertNotNull(movie8);
//
//        Movie movie9 = movieService.create(new Movie("tt9619833", "Fragments of Eden", "Thomas Benoit", 2024));
//        Assertions.assertNotNull(movie9);
//
//        Movie movie10 = movieService.create(new Movie("tt9619834", "Dominion Rising", "Grace Kim", 2025));
//        Assertions.assertNotNull(movie10);
//        Movie movie11 = movieService.create(new Movie("tt9619835", "Crimson Circuit", "Lena Hartmann", 2024));
//        Assertions.assertNotNull(movie11);
//
//        Movie movie12 = movieService.create(new Movie("tt9619836", "Afterlight", "Jae Park", 2023));
//        Assertions.assertNotNull(movie12);
//
//        Movie movie13 = movieService.create(new Movie("tt9619837", "Obsidian Skies", "Ibrahim Okoro", 2025));
//        Assertions.assertNotNull(movie13);
//
//        Movie movie14 = movieService.create(new Movie("tt9619838", "Radiant Drift", "Clara Jensen", 2022));
//        Assertions.assertNotNull(movie14);
//
//        Movie movie15 = movieService.create(new Movie("tt9619839", "Hollow Signal", "Marcelo Diaz", 2023));
//        Assertions.assertNotNull(movie15);
//
//        Movie movie16 = movieService.create(new Movie("tt9619840", "The Gravity Paradox", "Amara Thompson", 2024));
//        Assertions.assertNotNull(movie16);
//
//        Movie movie17 = movieService.create(new Movie("tt9619841", "Dreams Beyond Mercury", "Wei Chen", 2023));
//        Assertions.assertNotNull(movie17);
//
//        Movie movie18 = movieService.create(new Movie("tt9619842", "Iron Bloom", "Isabelle Fournier", 2025));
//        Assertions.assertNotNull(movie18);
//
//        Movie movie19 = movieService.create(new Movie("tt9619843", "Cascade Protocol", "Trevor Sinclair", 2023));
//        Assertions.assertNotNull(movie19);
//
//        Movie movie20 = movieService.create(new Movie("tt9619844", "Tide of the Ancients", "Fatima el-Masri", 2024));
//        Assertions.assertNotNull(movie20);
//
//        Movie movie21 = movieService.create(new Movie("tt9619845", "The Gilded Wound", "Noah Berkowitz", 2022));
//        Assertions.assertNotNull(movie21);
//
//        Movie movie22 = movieService.create(new Movie("tt9619846", "Frosted Epoch", "Katarina Volkov", 2023));
//        Assertions.assertNotNull(movie22);
//
//        Movie movie23 = movieService.create(new Movie("tt9619847", "Silver Lattice", "Zane Cooper", 2024));
//        Assertions.assertNotNull(movie23);
//
//        Movie movie24 = movieService.create(new Movie("tt9619848", "The Hollow Lens", "Chiara Romano", 2025));
//        Assertions.assertNotNull(movie24);
//
//        Movie movie25 = movieService.create(new Movie("tt9619849", "Eclipse Memory", "Haruto Sakamoto", 2023));
//        Assertions.assertNotNull(movie25);
//
//        Movie movie26 = movieService.create(new Movie("tt9619850", "Entropy's Garden", "Avery Blake", 2022));
//        Assertions.assertNotNull(movie26);
//
//        Movie movie27 = movieService.create(new Movie("tt9619851", "Signal to Titan", "Leila Djamal", 2023));
//        Assertions.assertNotNull(movie27);
//
//        Movie movie28 = movieService.create(new Movie("tt9619852", "Catalyst Dawn", "Lukas Steiner", 2024));
//        Assertions.assertNotNull(movie28);
//
//        Movie movie29 = movieService.create(new Movie("tt9619853", "The Phantom Frame", "Juliette Moreau", 2025));
//        Assertions.assertNotNull(movie29);
//
//        Movie movie30 = movieService.create(new Movie("tt9619854", "Twilight's Algorithm", "Desmond Kane", 2023));
//        Assertions.assertNotNull(movie30);
//
//
//    }
//

    @Test
    public void create() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void readById() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movie = movieService.findById(movie.getImdbId());
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void findOneByTitle() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        Movie readedMovie = movieService.findByTitle("final");
        Assertions.assertNotNull(readedMovie);
        movieService.delete(movie);
    }


}