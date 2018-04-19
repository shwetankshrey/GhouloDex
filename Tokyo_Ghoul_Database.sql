-- MySQL dump 10.13  Distrib 5.7.21, for macos10.13 (x86_64)
--
-- Host: localhost    Database: Tokyo_Ghoul
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Ghouls`
--

DROP TABLE IF EXISTS `Ghouls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ghouls` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `alias` varchar(25) DEFAULT NULL,
  `species` varchar(25) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `location` varchar(24) DEFAULT NULL,
  `kakuhou` varchar(24) DEFAULT NULL,
  `organization` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ghouls`
--

LOCK TABLES `Ghouls` WRITE;
/*!40000 ALTER TABLE `Ghouls` DISABLE KEYS */;
INSERT INTO `Ghouls` VALUES (1,'Ken Kaneki','Eyepatch','Half-Ghoul','Alive',22,'M',171,'CCG HQ','Rinkaku','Anteiku'),(2,'Touka Kirishima','Rabbit','Ghoul','Alive',20,'F',156,':re','Ukaku','Anteiku'),(3,'Nishiki Nishio','Serpent','Ghoul','Alive',26,'M',177,'11th Ward','Bikaku','Aogiri Tree'),(4,'Hinami Feuguchi','Daughter Ghoul','Ghoul','Alive',16,'F',148,'11th Ward','Rinkaku','Aogiri Tree'),(5,'Rize Kamishiro','Binge Eater','Ghoul','Unknown',22,'F',164,'11th Ward','Rinkaku','Aogiri Tree'),(6,'Shuu Tskiyama','Gourmet','Ghoul','Alive',24,'M',180,'Anteiku','Koukaku','Anteiku'),(7,'Yakumo Oomori','Jason','Ghoul','Deceased',35,'M',186,'11th Ward','Rinkaku','Aogiri Tree'),(8,'Renji Yomo','Raven','Ghoul','Alive',35,'M',182,':re','Ukaku','Anteiku'),(9,'Yoshimura','Kuzen','Ghoul','Unknown',63,'M',178,'Anteiku','Ukaku','Anteiku'),(10,'Uta','No Face','Ghoul','Alive',32,'M',177,'4th Ward','Rinkaku','Clowns'),(11,'Kazuichi Banjoi','Banjou','Ghoul','Alive',27,'M',187,'11th Ward','Ukaku','Aogiri Tree'),(12,'Ayato Kirishima','Black Rabbit','Ghoul','Alive',17,'M',165,'11th Ward','Ukaku','Aogiri Tree'),(13,'Itori','Bar Tender','Ghoul','Alive',40,'F',160,'14th Ward','Bikaku','Clowns'),(14,'Naki','Jason Jr.','Ghoul','Alive',20,'M',165,'11th Ward','Koukaku','Aogiri Tree'),(15,'Tatara','Dragon','Ghoul','Alive',47,'M',188,'11th Ward','Ukaku','Aogiri Tree'),(16,'Noro','Noroi','Ghoul','Alive',45,'M',184,'11th Ward','Bikaku','Aogiri Tree'),(17,'Eto Yoshimura','One Eyed Owl','Half-Ghoul','Alive',26,'F',151,'11th Ward','Ukaku','Aogiri Tree'),(18,'Donato Porpora','Priest','Ghoul','Alive',68,'M',179,'Cochlea','Koukaku','Clowns'),(19,'Karao Saeki','Torso','Ghoul','Alive',30,'M',175,'1st Ward','Rinkaku','Aogiri Tree'),(20,'Matasaka Kamishiro','Shachi','Ghoul','Alive',41,'M',177,'6th Ward','Bikaku','Aogiri Tree'),(21,'Kuki Urie','Urie','Half-Ghoul','Alive',19,'M',175,'CCG HQ','Koukaku','CCG'),(22,'Saiko Yonebayashi','Saiko','Half-Ghoul','Alive',19,'F',143,'CCG HQ','Rinkaku','CCG'),(23,'Tooru Mutsuki','Toru','Half-Ghoul','Alive',19,'M',165,'CCG HQ','Bikaku','CCG'),(24,'Ginshi Shirazu','Shiro','Half-Ghoul','Alive',19,'M',176,'CCG HQ','Ukaku','CCG');
/*!40000 ALTER TABLE `Ghouls` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Investigators`
--

DROP TABLE IF EXISTS `Investigators`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Investigators` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `alias` varchar(25) DEFAULT NULL,
  `height` int(3) DEFAULT NULL,
  `quinque` varchar(25) DEFAULT NULL,
  `rank` varchar(25) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `location` varchar(25) DEFAULT NULL,
  `Organization` varchar(25) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Investigators`
--

LOCK TABLES `Investigators` WRITE;
/*!40000 ALTER TABLE `Investigators` DISABLE KEYS */;
INSERT INTO `Investigators` VALUES (1,'Koutarou Amon','Floppy',191,'Doujima 1/2','Special Class','M','Unknown','CCG','Unknown',30),(2,'Kishou Arima','Death God of CCG',180,'Narukami','Special Class','M','CCG HQ','CCG','Alive',32),(3,'Itsuki Marude','Chief',175,'Unknown','Special Class','M','CCG HQ','CCG','Alive',47),(4,'Kureo Mado','Mad Mado',177,'Kura','Associate Special Class','M','CCG HQ','CCG','Deceased',60),(5,'Akira Mado','Spine User',164,'Amatsu','First Class','F','CCG HQ','CCG','Alive',24),(6,'Haise Sasaki','Sassan',170,'Yukimura 1/3 ','Rank 1','M','CCG HQ','CCG','Alive',22),(7,'Yukinori Shinohara','Invulnerable Shinohara',185,'Demon Yamada 1','Special Class','M','CCG HQ','CCG','Comatose',37),(8,'Iwao Kuroiwa','Iwaccho',181,'Kuroiwa Special','Special Class','M','CCG HQ','CCG','Alive',41),(9,'Juuzou Suzuya','CCG Jason',160,'13 Jason','Associate Speial Class','M','CCG HQ','CCG','Alive',22),(10,'Kousuke Houji','Houji',174,'Chi She','Special  Class','M','CCG HQ','CCQ','Alive',36),(11,'Mougan Tanakamaru','Mogan',180,'Higher Mind','Special Class','M','CCG HQ','CCG','Alive',40),(12,'Koori Ui','Hope of Arima Squad',169,'Taruhi','Special Class','M','CCG HQ','CCG','Alive',28),(13,'Chuu Hachikawa','Hachikawa',185,'Kajiri','Associate Special Class','M','CCG HQ','CCG','Alive',39),(14,'Seidou Takizawa','T-OWL',171,'Douhi','Rank 2','M','Unknown','CCG','Unknown',23),(15,'Take Hirako','Judas',172,'Yukimura 1/3','First Class','M','CCG HQ','CCG','Alive',31),(16,'Kichimura Washuu','Nimura Furuta',175,'Rotten Follow','Rank 1','M','CCG HQ','CCG','Alive',23),(17,'Kuki Urie','Uri',175,'Ginkui','Rank 2','M','CCG HQ','CCG','Alive',19),(18,'Saiko Yonebayashi','Saiko',143,'Bokusatsu No.2','Rank 3','F','CCG HQ','CCG','Alive',19),(19,'Tooru Mutsuki','Toru',165,'Ifraft','Rank 3','F','CCG HQ','CCG','Alive',19),(20,'Ginshi Shirazu','Shiro',176,'Nutcracker','Rank 3','M','CCG HQ','CCG','Alive',19);
/*!40000 ALTER TABLE `Investigators` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Kakuhou`
--

DROP TABLE IF EXISTS `Kakuhou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Kakuhou` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `info` varchar(600) DEFAULT NULL,
  `pros` varchar(350) DEFAULT NULL,
  `cons` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Kakuhou`
--

LOCK TABLES `Kakuhou` WRITE;
/*!40000 ALTER TABLE `Kakuhou` DISABLE KEYS */;
INSERT INTO `Kakuhou` VALUES (1,'Ukaku','This kagune means shining feather and it is spread out (like a bird’s wing) and released from the shoulder area. The kagune is lightweight and can be used to deliver high-speed attacks. This kagune is suited for both short-distance and long-distance attacks. This kagune gives ghouls a higher chance to end the battle after a short time. However, when releasing the Rc cells, the ghoul’s stamina decreases drastically. Ukaku-type users lack endurance and are at disadvantage if the battle drags on for a long time.','Highly efficient for long range quick speed attacks. This kagune is lightweight. It can be used to end the battle quickly through bolt like projectile attacks. It can also be modified into a Koukaku type kagune to defend in short range battles.',NULL),(2,'Koukaku','This kagune means shining shell and is metallic and released below the shoulder blade. It is heavy and extremely robust which makes it have the greatest sturdiness out of all the rest of the kagunes. This kagune not only provides defense by changing into armors or shields but it also can be shaped into melee weapons such as drills, hammers, or blades when going into the offense.A koukaku-user can fend off ukaku-user’s onslaught using its guarding capabilities and preventing the ukaku from attacking.','Due to its high Rc cell density it is quite robust and extremely heavy , making it extremely sturdy. All of these factors make it a really good for defense. They can be really efficient for tiring out an ukaku ghoul','Ukaku kagune take up a lot of Rc cell energy and hence Ukaku ghouls lack endurance and stamina. It is ill suited for short range battles.'),(3,'Rinkaku','A rinkaku kagune is also known as shining scales and has an appearance similar to scared tentacles that are released at the back around the waist. This kagune has powerful regenerative abilities and its peculiar appearance and structure yields a superior striking power which makes this kagune excel in brute strength. Because the kagune’s regenerative power is a result of the Rc cells easily binding together causing them to be weak, this kagune is brittle and fragile.','A rinkaku wielder has powerful regenerative abilities and some could even survive the most critical of damage. Its peculiar appearance and structure yield a superior striking power and they excel in brute strength.','A rinkaku has serious problems fighting against the balanced bikaku kagune: A bikaku has comprehensively high power, allowing them to fight against the brute-force rinkaku, and the rinkaku kagune softness makes it comparatively easy for the bikaku to cut the kagune off.'),(4,'Bikaku','The bikaku is known as shining tail and typically has a tail-like appearance when released around the tailbone. it is good for medium distance attacks and has a decent offense, defense, and speed. They have no notable strengths or weaknesses meaning the kagune itself is treated as a surprise trump card.A bikaku will be overwhelmed by the fast ukaku user and will lose against the ukaku’s long-distance attacks. Because of the bikaku’s balanced characteristics, this makes the kagune a preferred quinque type for CCG investigators, causing the bikaku-users to be hunted.','It is good for medium-distance attacks and has decent offense, defense, and speed. Thus, they have no notable strengths or weaknesses like the kagune based on other Rc types, meaning the kagune itself is treated as a surprise trump card.','A bikaku will be overwhelmed by the faster ukaku-user and will lose against the ukaku\'s long-range attacks.');
/*!40000 ALTER TABLE `Kakuhou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Locations`
--

DROP TABLE IF EXISTS `Locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Locations` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `info` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Locations`
--

LOCK TABLES `Locations` WRITE;
/*!40000 ALTER TABLE `Locations` DISABLE KEYS */;
INSERT INTO `Locations` VALUES (1,'CCG HQ','The CCG HQ is the primary headquarters of Commission of Counter Ghoul,located in 1st ward of Tokyo. It is the branch responsible for overseeing the 1st ward,as well as managing all other branches of the organization. Ghoul Investigators are deployed from this branch to other wards as necessary.'),(2,':re',':re was a coffee shop run by Renji Yomo and Touka Kirishima. It was first introduced in :re Chapter 9, when Ginshi Shirazu, Tooru Mutsuki, and Haise Sasaki stopped by for a coffee. The cafe was later used as one of the places of shelter for members of the Goat organization. Later, it was destroyed during an ambush of Tooru Mutsuki and Shinsanpei Aura. At the end of Tokyo Ghoul root A, Touka puts a :re sign up as she opens for the day.'),(3,'11th Ward','The 11th Ward Base was a complex in the 11th Ward of Tokyo, taken over by the organization Aogiri Tree. It was used for their operations there, and was the location of the 11th Ward Battle. The sprawling base had a total of nine buildings, and was considered an extremely strategic location because of the surrounding terrain. Thick forests surrounded the complex from the sides, while a steep cliff and ocean made an attack from the front the only option.'),(4,'Anteiku','Anteiku was a small neighborhood cafe in the Tokyo Ghoul series. On the surface, the cafe appeared innocent, plain, and pleasant. However, at its heart, it was also an organization of ghouls of the 20th ward. It provided aid for ghouls in need, managed the feeding grounds of those in the 20th ward, and collected food for others by searching for the bodies of humans who committed suicide. Anteiku had two floors and a basement.'),(5,'4th Ward','The 4th ward is the Shinjuku ward in Tokyo. For ghouls, the ward is nearly uninhabitable.'),(6,'14th Ward','The 14th Ward is the Nakano ward in Tokyo. Cannibalism is the latest trend among ghouls living in this ward.'),(7,'Cochlea','Cochlea is a ghoul detention center located in the 23rd ward owned by the CCG. Captured ghouls get detained here after the decision is made to keep them alive either for information, quinque materials, or any other exceptional need from them. While in custody, ghouls are also weakened by Rc suppressants.'),(8,'1st Ward','The 1st ward is the Chiyoda ward in Tokyo. It is the center of government for the city of Tokyo and the primary headquarters of the Commission of Counter Ghoul. For ghouls, the ward is nearly uninhabitable.'),(9,'6th Ward','The 6th ward is the Taito ward in Tokyo. The area was once led by Shachi\'s group, however, since their disbandment, an unknown group has taken over management of the ward.');
/*!40000 ALTER TABLE `Locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organizations`
--

DROP TABLE IF EXISTS `organizations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organizations` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `info` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organizations`
--

LOCK TABLES `organizations` WRITE;
/*!40000 ALTER TABLE `organizations` DISABLE KEYS */;
INSERT INTO `organizations` VALUES (1,'CCG','Anteiku was a small neighborhood cafe in the Tokyo Ghoul series. On the surface, the cafe appeared innocent, plain, and pleasant. However, at its heart, it was also an organization of ghouls of the 20th ward. It provided aid for ghouls in need, managed the feeding grounds of those in the 20th ward, and collected food for others by searching for the bodies of humans who committed suicide.'),(2,'Anteiku','Anteiku was a small neighborhood cafe in the Tokyo Ghoul series. On the surface, the cafe appeared innocent, plain, and pleasant. However, at its heart, it was also an organization of ghouls of the 20th ward. It provided aid for ghouls in need, managed the feeding grounds of those in the 20th ward, and collected food for others by searching for the bodies of humans who committed suicide.'),(3,'Aogiri Tree','Aogiri Tree was a ghoul terrorist organization founded by Eto Yoshimura. They actively combated the CCG, inflicting heavy casualties on them. In recent years, the organization had grown in power, becoming a large threat to the CCG and developed a notorious reputation among ghouls, and was one of the CCG\'s most pressing priorities.'),(4,'Clowns','The Clowns are a group of ghouls with a mysterious goal or purpose. Its members primarily wear clown-themed masks and state their intentions are to have the last laugh. The CCG had planned a famous investigation on them in the 3rd ward, as mentioned in New Book of Ghoul Dismantling read by Hideyoshi Nagachika, but their current residing ward is unspecified.');
/*!40000 ALTER TABLE `organizations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-19  5:31:09
