INSERT INTO user (email, name, password, surname) VALUES ('mail@mail.pl', 'Pawel', 'password','Zacharz');

INSERT INTO flashcard_type(name) VALUES('ZWIERZĘTA');
INSERT INTO flashcard_type(name) VALUES('CZASOWNIKI');
INSERT INTO flashcard_type(name) VALUES('RZECZOWNIKI');

INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Ptak', 'Bird',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Nietoperz', 'Bat',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Niedźwiedź', 'Bear',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Pszczoła', 'Bee',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Kot', 'Cat',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Pies', 'Dog',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Krowa', 'Cow',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Świnia', 'Pig',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Lew', 'Lion',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Słoń', 'Elephant',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Żółw', 'Turtle',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Żaba', 'Frog',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Mucha', 'Fly',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Papuga', 'Parrot',1);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Wilk', 'Wolf',1);

INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Spacerować', 'Walk',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Stać', 'Stand',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Ciągnąć', 'Pull',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Powiesić', 'Hang',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Rzucić', 'Throw',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Spać', 'Sleep',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Naciskać', 'Push',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Skakać', 'Jump',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Trzymać', 'Hold',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Pływać', 'Swim',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Biegać', 'Run',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Siedzieć', 'Sit',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Kupić', 'Buy',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Móc', 'Can',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Być', 'be',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Jeść', 'Eat',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Prowadzić pojazd', 'Drive',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Mieć', 'Have',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Robić', 'Make',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Mówić', 'Speak',2);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Pisać', 'Write',2);

INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Czas', 'Time',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Rok', 'Year',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Dzień', 'Day',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Miesiąc', 'Month',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Ludzie', 'People',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Osoba', 'Person',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Mężczyzna', 'Man',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Kobieta', 'Woman',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Dziecko', 'Child',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Rzecz', 'Thing',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Świat', 'World',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Rodzina', 'Family',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Szkoła', 'School',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Student/uczeń', 'Student',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Państwo', 'Country',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Problem', 'Problem',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Ręka', 'Hand',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Głowa', 'Head',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Noc', 'Night',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Matka', 'Mother',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Ojciec', 'Father',3);
INSERT INTO flashcards (front, back, flashcard_type_typeid) VALUES ('Praca', 'Job',3);

INSERT INTO gradation (comparative, normal, superlative) VALUES ('smaller', 'small', 'the smallest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('taller', 'tall', 'the tallest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('nicer', 'nice', 'the nicest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('larger', 'large', 'the largest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('bigger', 'big', 'the biggest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('hotter', 'hot', 'the hottest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('happier', 'happy', 'the happiest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('faster', 'fast', 'the fastest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('warmer', 'warm', 'the warmest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('easier', 'easy', 'the easiest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('drier', 'dry', 'the driest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('prettier', 'pretty', 'the prettiest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('thinner', 'thin', 'the thinnest');


INSERT INTO gradation (comparative, normal, superlative) VALUES ('more popular', 'popular', 'the most popular');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more famous', 'famous', 'the most famous');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more beautiful', 'beautiful', 'the most beautiful');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more intelligent', 'intelligent', 'the most intelligent');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more important', 'important', 'the most important');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more interesting', 'interesting', 'the most interesting');

INSERT INTO gradation (comparative, normal, superlative) VALUES ('better', 'good', 'the best');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('worse', 'bad', 'the worst');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('further', 'far', 'the furthest');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more', 'many', 'the most');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('more', 'much', 'the most');
INSERT INTO gradation (comparative, normal, superlative) VALUES ('less', 'little', 'the least');


INSERT INTO nouns (noun, is_countable) VALUES ('bread', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('cash', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('dirt', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('energy', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('fire', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('food', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('grass', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('ice', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('money', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('music', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('hair', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('knowledge', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('luggage', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('love', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('milk', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('soap', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('sugar', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('water', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('wine', 0);
INSERT INTO nouns (noun, is_countable) VALUES ('weather', 0);

INSERT INTO nouns (noun, is_countable) VALUES ('child', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('man', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('woman', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('person', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('tooth', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('mouse', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('foot', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('sheep', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('fish', 1);

INSERT INTO nouns (noun, is_countable) VALUES ('car', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('bus', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('dress', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('tomato', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('potato', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('baby', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('wolf', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('elephant', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('bottle', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('monitor', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('keyboard', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('speaker', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('book', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('house', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('shelf', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('carpet', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('cable', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('device', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('dog', 1);
INSERT INTO nouns (noun, is_countable) VALUES ('cat', 1);


INSERT INTO tenses (answer, sentence, tense) VALUES ('open', 'The shops usually..........early. (open)', 'present_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('drink', 'I always..........tea in the evening. (drink)' , 'present_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('writes', 'My mum..........books. (write)', 'present_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('read', 'I..........many articles. (read)', 'present_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('costs', 'This phone..........a lot of money. (cost)', 'present_simple');


INSERT INTO tenses (answer, sentence, tense) VALUES ('arranged', 'Last spring Pawel and I..........to go camping. (arrange)', 'past_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('went', 'Karol..........to the cinema three times last month. (go)', 'past_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('ate', 'The children..........a whole bar of chocolate an hour ago. (eat)', 'past_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('managed', 'Last winter I..........to redecorate the whole flat. (manage)', 'past_simple');
INSERT INTO tenses (answer, sentence, tense) VALUES ('saw', 'My father once..........Lionel Messi in Spain. (see)', 'past_simple');

INSERT INTO tenses (answer, sentence, tense) VALUES ('are arguing', 'My parents..........right now. (argue)', 'present_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('is taking', 'My brother..........his dog for a walk. (take)', 'present_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('are listening', 'Robert and Tomek..........to the radio. (listen)', 'present_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('is raining', 'It..........in Warsaw today. (rain)', 'present_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('is sleeping', 'She..........in her bedroom. (sleep)', 'present_continuous');

INSERT INTO tenses (answer, sentence, tense) VALUES ('was shining', 'The sun..........all day yesterday. (shine)', 'past_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('was still running', 'Half an hour ago his dog..........around outside. (still/run)', 'past_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('were following', 'You..........me all day yesterday. (follow)', 'past_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('were playing', 'At nine o''clock yesterday my little nephews..........in their room. (play)', 'past_continuous');
INSERT INTO tenses (answer, sentence, tense) VALUES ('were fishing', 'The boys..........when I reached the lake. (fish)', 'past_continuous');




INSERT INTO translation(answer, sentence, tense) VALUES('Łucja jest moją najlepszą przyjaciółką','Łucja is my best friend','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Tomek pochodzi z Kanady','Tomek comes from Canada','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Ona jest zawsze uprzejma','She is always polite','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Ona jest wysoka i szczupła','She is tall and slim','present_simple');

INSERT INTO translation(answer, sentence, tense) VALUES('Paweł doesn’t go to school at the weekends','Paweł nie chodzi do szkoły w weekendy','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Anna tidies her room once a week','Anna sprząta swój pokój raz w tygodniu','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('How often do you have a guitar lesson?','Jak często masz lekcję gry na gitarze?','present_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('I like watching films','Lubię oglądać filmy','present_simple');



INSERT INTO translation(answer, sentence, tense) VALUES('Zeszłego lata byłem w Hiszpanii','Last summer I was in Spain','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Byłem w kinie w zeszłym miesiącu','I was in cinema last month','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Rozmawiała ze mną dwa dni temu','She spoke to me two days ago','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('Nie było go w mieście zeszłego lata','He wasn’t in town last summer','past_simple');

INSERT INTO translation(answer, sentence, tense) VALUES('Łukasz was not satisfied','Łukasz nie był zadowolony','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('They have never been to Poland.','Oni nigdy nie byli w Polsce','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('You ate a dinner yesterday.','Jedliście wczoraj obiad.','past_simple');
INSERT INTO translation(answer, sentence, tense) VALUES('You did a good thing yesterday.','Zrobiłeś wczoraj dobrą rzecz.','past_simple');



INSERT INTO translation(answer, sentence, tense) VALUES('Co robicie?','What are you doing?','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Co czytasz?','What are you reading?','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Magda tańczy z jej mężem','Magda is dancing with her husband','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Kot się budzi','The cat is waking up','present_continuous');

INSERT INTO translation(answer, sentence, tense) VALUES('I am calling Robert','Dzwonię do Roberta','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('We are going for a walk.','Idziemy na spacer','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Is he finishing work?','Czy on kończy pracę?','present_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Where are they sitting?','Gdzie oni siedzą?','present_continuous');



INSERT INTO translation(answer, sentence, tense) VALUES('Jej brat jechał na rowerze','Her brother was riding a bicycle.','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Ona miała na sobie czarne spodnie','She was wearing black pants','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Oni rozmawiali o kimś','They were talking about someone','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('Odrabaiałem prace domową','I was doing my homework','past_continuous');

INSERT INTO translation(answer, sentence, tense) VALUES('I was going to school','Szedłem do szkoły','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('My mother was reading a book.','Moja mama czytała książkę','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('It was raining yesterday','Wczoraj padało','past_continuous');
INSERT INTO translation(answer, sentence, tense) VALUES('My dad was driving the car yesterday','Mój tata wczoraj. prowadził samochód','past_continuous');







