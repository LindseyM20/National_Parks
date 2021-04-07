-- INSTRUCTIONS: 
-- 	1. create park table. (do not create other tables. JPA does that for us.)
-- 	2. run insert statements into park table. 
-- 	3. run app on server

-- create database national_parks;
use national_parks;

-- drop table bucket_been;
-- drop table park;
-- drop table user;
-- drop table journal;


-- create table park(
-- park_id int primary key auto_increment NOT NULL,
-- name varchar(100) NOT NULL,
-- state varchar(50),
-- year_founded int,
-- photoLocal varchar(300),
-- photoURL varchar(300),
-- photo_cred varchar(150),
-- summary varchar(1000) NOT NULL
-- );

-- create table user(
-- id int primary key auto_increment NOT NULL,
-- name varchar(60) NOT NULL,
-- email varchar(60) NOT NULL unique,
-- password varchar(25) NOT NULL
-- );

-- create table journal(
-- id int primary key auto_increment,
-- entry varchar(1000)
-- );

-- old bucket_been table. (removed date. new one below)
-- create table bucket_been(
-- park_id int NOT NULL,
-- user_id int NOT NULL,
-- visited boolean,
-- journal_id int,
-- constraint PK_id primary key (park_id, user_id),
-- constraint FK_park_id foreign key (park_id) references park (id),
-- constraint FK_user_id foreign key (user_id) references user (id),
-- constraint FK_journal_id foreign key (journal_id) references journal (id)
-- );

-- select * from park;

Insert into park values(null, 'Acadia National Park', 'Maine', 1929, '/images/acadia.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Bass-Harbor-Lighthouse-Acadia-national-park.jpg', 
    'Credit: Philippe Gratton/ iStock', 
    "Acadia National Park protects the natural beauty of the highest rocky headlands along the Atlantic coastline of the United States, 
    an abundance of habitats, and a rich cultural heritage. At 3.5 million visits a year, it's one of the top 10 most-visited national 
    parks in the United States. Visitors enjoy 27 miles of historic motor roads, 158 miles of hiking trails, and 45 miles of carriage roads.");
    
Insert into park values(null, 'Arches National Park', 'Utah', 1929, '/images/arches.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Delicate-Arch--Arches-National-Park.jpg', 
    'Credit: mmac72/ iStock', 
    "Visit Arches to discover a landscape of contrasting colors, land forms, and textures unlike any other in the world. 
    The park has over 2,000 natural stone arches and hundreds of soaring pinnacles, massive rock fins, and giant balanced rocks. 
    This red-rock wonderland will amaze you with its formations, refresh you with its trails, and inspire you with its sunsets.");
    
Insert into park values(null, 'Badlands National Park', 'South Dakota', 1939, '/images/badlands.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Badlands-National-Park-at-Sunrise.jpg', 
    'Credit: LarryKnupp/ iStock', 
    "The rugged beauty of the Badlands draws visitors from around the world. These striking geologic deposits 
    contain one of the world's richest fossil beds. Ancient horses and rhinos once roamed here. The park's 244,000 
    acres protect an expanse of mixed-grass prairie where bison, bighorn sheep, prairie dogs, and black-footed ferrets live today.");
     
Insert into park values(null, 'Big Bend National Park', 'Texas', 1944, '/images/big_bend.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Sagebrush-in-Bloom-at-the-Chisos-Mountains.jpg', 
    'Credit: jamespharaon/ iStock', 
    "There is a place in Far West Texas where night skies are dark as coal and rivers carve temple-like canyons in ancient limestone. 
    Here, at the end of the road, hundreds of bird species take refuge in a solitary mountain range surrounded by weather-beaten desert. Tenacious cactus 
    bloom in sublime southwestern sun, and diversity of species is the best in the country. This magical place is Big Bend.");
     
Insert into park values(null, 'Biscayne National Park', 'Florida', 1980, '/images/biscayne.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Beautiful-Biscayne-National-Park.jpg', 
    'Credit: Fotoluminate LLC/ Shutterstock', 
    "Within sight of downtown Miami, yet worlds away, Biscayne protects a rare combination of aquamarine waters, emerald islands, and 
    fish-bejeweled coral reefs. Evidence of 10,000 years of human history is here too, from pirates and shipwrecks to pineapple farmers and presidents. 
    Outdoors enthusiasts can boat, snorkel, camp, watch wildlife… or simply relax in a rocking chair gazing out over the bay.");

Insert into park values(null, 'Black Canyon of the Gunnison National Park', 'Colorado', 1999, '/images/black_canyon.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Black-Canyon-of-the-Gunnison-National-Park--in-fall.jpg', 
    'Credit: Anton Foltin/ Shutterstock', 
    "Big enough to be overwhelming, still intimate enough to feel the pulse of time, Black Canyon of the Gunnison exposes you to some of the 
    steepest cliffs, oldest rock, and craggiest spires in North America. With two million years to work, 
    the Gunnison River, along with the forces of weathering, has sculpted this vertical wilderness of rock, water, and sky.");
    
Insert into park values(null, 'Bryce Canyon National Park', 'Utah', 1928, '/images/bryce.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Bryce-Canyon-Sunrise.jpg', 
    'Credit: MJFelt/ iStock', 
    "Hoodoos (irregular columns of rock) exist on every continent, but here is the largest concentration found anywhere on Earth. 
    Situated along a high plateau at the top of the Grand Staircase, the park's high elevations 
    include numerous life communities, fantastic dark skies, and geological wonders that defy description.");
    
Insert into park values(null, 'Canyonlands National Park', 'Utah', 1964, '/images/canyonlands.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Glowing-Mesa-Arch-at-sunrise.jpg', 
    'Credit: Don Mammoser/ Shutterstock', 
    "Canyonlands invites you to explore a wilderness of countless canyons and fantastically formed buttes carved by the Colorado River 
    and its tributaries. Rivers divide the park into four districts: Island in the Sky, The Needles, The Maze, and the rivers themselves. 
    These areas share a primitive desert atmosphere, but each offers different opportunities for sightseeing and adventure.");
    
Insert into park values(null, 'Capitol Reef National Park', 'Utah', 1971, '/images/capitol.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Capitol-Reef-National-Park-sunset.jpg', 
    'Credit: TomKli/ Shutterstock', 
    "Located in south-central Utah in the heart of red rock country, Capitol Reef National Park is a hidden 
    treasure filled with cliffs, canyons, domes, and bridges in the Waterpocket Fold, 
    a geologic monocline (a wrinkle on the earth) extending almost 100 miles.");
    
Insert into park values(null, 'Carlsbad Caverns National Park', 'New Mexico', 1930, '/images/carlsbad.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Big-Room--Carlsbad-Caverns-National-Park.jpg', 
    'Credit: Doug Meek/ Shutterstock', 
    "High ancient sea ledges, deep rocky canyons, flowering cactus, and desert wildlife - treasures 
    above the ground in the Chihuahuan Desert. Hidden beneath the surface are more 
    than 119 caves - formed when sulfuric acid dissolved limestone leaving behind caverns of all sizes.");
    
Insert into park values(null, 'Channel Islands National Park', 'California', 1980, '/images/channel.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Channel-Islands-National-Park-Landscape.jpg', 
    'Credit: benedek/ iStock', 
    "Channel Islands National Park encompasses five remarkable islands and their ocean environment, preserving and protecting a wealth 
    of natural and cultural resources. Isolation over thousands of years has created unique animals, plants, and archeological resources found nowhere 
    else on Earth and helped preserve a place where visitors can experience coastal southern California as it once was.");
    
Insert into park values(null, 'Congaree National Park', 'South Carolina', 2003, '/images/congaree.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Congaree-National-Forest-Boardwalk.jpg', 
    'Credit: skiserge1/iStock', 
    "Astonishing biodiversity exists in Congaree National Park, the largest intact expanse of old growth bottomland hardwood forest remaining 
    in the southeastern United States. Waters from the Congaree and Wateree Rivers sweep through the floodplain, carrying nutrients and sediments 
    that nourish and rejuvenate this ecosystem and support the growth of national and state champion trees.");
    
Insert into park values(null, 'Crater Lake National Park', 'Oregon', 1902, '/images/crater.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Crater-Lake-sunrise.jpg', 
    'Credit: Pierre Leclerc/ Shutterstock', 
    "Crater Lake inspires awe. Native Americans witnessed its formation 7,700 years ago, when a violent eruption triggered the collapse 
    of a tall peak. Scientists marvel at its purity: fed by rain and snow, it's the deepest lake in the USA and one of the most pristine on earth. Artists, 
    photographers, and sightseers gaze in wonder at its blue water and stunning setting atop the Cascade Mountain Range.");
    
Insert into park values(null, 'Cuyahoga Valley National Park', 'Ohio', 1974, '/images/cuyahoga.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Brandywine-Falls.jpg', 
    'Credit: lipika/ iStock', 
    "Though a short distance from the urban areas of Cleveland and Akron, Cuyahoga Valley National Park seems worlds away. The park 
    is a refuge for native plants and wildlife, and provides routes of discovery for visitors. The winding Cuyahoga River gives way to deep forests, 
    rolling hills, and open farmlands. Walk or ride the Towpath Trail to follow the historic route of the Ohio & Erie Canal.");
    
Insert into park values(null, 'Death Valley National Park', 'California, Nevada', 1994, '/images/death.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Colorful-Ridges-Of-Death-Valley-National-Park.jpg', 
    'Credit: Doug Lemke/ Shutterstock', 
    "In this below-sea-level basin, steady drought and record summer heat make Death Valley a land of extremes. Yet, each extreme has a 
    striking contrast. Towering peaks are frosted with winter snow. Rare rainstorms bring vast fields of wildflowers. Lush oases harbor 
    tiny fish and refuge for wildlife and humans. Despite its morbid name, a great diversity of life survives in Death Valley.");
    
Insert into park values(null, 'Denali National Park and Preserve', 'Alaska', 1976, '/images/denali.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Mountains-in-Denali.jpg', 
    'Credit: joannasgallery/ iStock', 
    "Denali is six million acres of wild land, bisected by one ribbon of road. Travelers along it see the relatively low-elevation 
    taiga forest give way to high alpine tundra and snowy mountains, culminating in North America's tallest peak, 20,310' Denali. Wild 
    animals large and small roam un-fenced lands, living as they have for ages. Solitude, tranquility and wilderness await.");
    
Insert into park values(null, 'Dry Tortugas National Park', 'Florida', 1935, '/images/dry_tort.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/aerial-view-Dry-Tortugas-National-Park-in-Florida.jpg', 
    'Credit: Varina C/ Shutterstock', 
    "Almost 70 miles (113 km) west of Key West lies the remote Dry Tortugas National Park. This 100-square mile park is mostly open water 
    with seven small islands.  Accessible only by boat or seaplane, the park is known the world over as the home of magnificent Fort Jefferson, picturesque 
    blue waters, superlative coral reefs and marine life, and the vast assortment of bird life that frequents the area.");
    
Insert into park values(null, 'Everglades National Park', 'Florida', 1947, '/images/everglades.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Florida-wetland-Everglads-national-park.jpg', 
    'Credit: Romrodphoto/ Shutterstock', 
    "Everglades National Park protects an unparalleled landscape that provides important habitat for numerous rare and endangered species like the manatee, 
    American crocodile, and the elusive Florida panther. An international treasure as well -  a World Heritage Site, International Biosphere Reserve, 
    a Wetland of International Importance, and a specially protected area under the Cartagena Treaty.");
    
Insert into park values(null, 'Gates of the Arctic National Park', 'Alaska', 1980, '/images/gates.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Gates-of-the-arctic-National-Park.jpg', 
    'Credit: inEthos Design/Shutterstock', 
    "This vast landscape does not contain any roads or trails. Visitors discover intact ecosystems where people have lived with the land for 
    thousands of years. Wild rivers meander through glacier-carved valleys, caribou migrate along age-old trails, endless summer 
    light fades into aurora-lit night skies of winter. It remains virtually unchanged except by the forces of nature.");
    
Insert into park values(null, 'Gateway Arch National Park', 'Missouri', 2018, '/images/gateway.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/St.-Louis-Gateway-Arch-and-Lake.jpg', 
    'Credit: Davel5957/iStock', 
    "The Gateway Arch reflects St. Louis' role in the Westward Expansion of the United States during the nineteenth century. 
    The park is a memorial to Thomas Jefferson's role in opening the West, to the pioneers 
    who helped shape its history, and to Dred Scott who sued for his freedom in the Old Courthouse.");
    
Insert into park values(null, 'Glacier National Park', 'Montana', 1910, '/images/glacier.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Logan-Pass--Glacier-National-Park.jpg', 
    'Credit: kan_khampanya/ Shutterstock', 
    "Come and experience Glacier's pristine forests, alpine meadows, rugged mountains, and spectacular lakes. With over 700 miles of trails, 
    Glacier is a hiker's paradise for adventurous visitors seeking wilderness and solitude. Relive the days of old through historic chalets, 
    lodges, and the famous Going-to-the-Sun Road. Explore Glacier National Park and discover what awaits you.");
    
Insert into park values(null, 'Glacier Bay National Park', 'Alaska', 1980, '/images/glacier_bay.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Glacier-Bay-National-Park-Alaska.jpg', 
    'Credit: aarbois/ Shutterstock', 
    "Covering 3.3 million acres of rugged mountains, dynamic glaciers, temperate rainforest, wild coastlines and deep sheltered fjords, Glacier 
    Bay National Park is a highlight of Alaska's Inside Passage and part of a 25-million acre World Heritage Site - one of the world's largest 
    international protected areas. From sea to summit, Glacier Bay offers limitless opportunities for adventure and inspiration.");
    
Insert into park values(null, 'Grand Canyon National Park', 'Arizona', 1919, '/images/grand_can.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Grand-Canyon-landscape-at-dusk.jpg', 
    'Credit: jose1983/ iStock', 
    "Located in Arizona, Grand Canyon National Park encompasses 277 miles (446 km) of the Colorado River and adjacent uplands. The park is 
    home to much of the immense Grand Canyon; a mile (1.6 km) deep, and up to 18 miles (29 km) wide. Layered bands of colorful rock reveal 
    millions of years of geologic history. Grand Canyon is unmatched in the incomparable vistas it offers visitors from the rim.");
    
Insert into park values(null, 'Grand Teton National Park', 'Wyoming', 1929, '/images/grand_teton.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Sunrise-at-Moulton-barn-in-grand-tetons.jpg', 
    'Credit: AnujSahaiPhotography/ iStock', 
    "Rising above a scene rich with extraordinary wildlife, pristine lakes, and alpine terrain, the Teton Range stands as a monument to the 
    people who fought to protect it. These are mountains of the imagination. Mountains that led to the creation of Grand Teton National Park 
    where you can explore over two hundred miles of trails, float the Snake River, and enjoy the serenity of this remarkable place.");
    
Insert into park values(null, 'Great Basin National Park', 'Nevada', 1986, '/images/great_basin.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Wheeler-Peak-Great-Basin-National-Park.jpg', 
    'Credit: Arlene Waller/ Shutterstock', 
    "From the 13,063-foot summit of Wheeler Peak, to the sage-covered foothills, Great Basin National Park is a place to sample the stunning 
    diversity of the larger Great Basin region. Come and partake of the solitude of the wilderness, walk among ancient bristlecone pines, bask 
    in the darkest of night skies, and explore mysterious subterranean passages. There's a whole lot more than just desert here!");
    
Insert into park values(null, 'Great Sand Dunes National Park and Preserve', 'Colorado', 1932, '/images/great_sand.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Great-Sand-Dunes-National-Park.jpg', 
    'Credit: Eric Brinley/ Shutterstock', 
    "Open all day and night year round, the tallest dunes in North America are the centerpiece in a diverse landscape of grasslands, 
    wetlands, conifer and aspen forests, alpine lakes, and tundra. Experience a starry sky on moonless nights, 
    or a surreal walk on the dunes under bright full moonlight.");
    
Insert into park values(null, 'Great Smoky Mountains National Park', 'North Carolina, Tennessee', 1934, '/images/great_smoky.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Great-Smoky-Mountains-National-Park-Scenic-Sunrise.jpg', 
    'Credit: Dave Allen Photography/ Shutterstock', 
    "Ridge upon ridge of forest straddles the border between North Carolina and Tennessee in Great Smoky Mountains National Park. World 
    renowned for its diversity of plant and animal life, the beauty of its ancient mountains, and the quality of its remnants of Southern 
    Appalachian mountain culture, this is America's most visited national park.");
    
Insert into park values(null, 'Guadalupe Mountains National Park', 'Texas', 1972, '/images/guadalupe.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Guadalupe-Mountains-National-Park.jpg', 
    'Credit: RobertWaltman/ iStock', 
    "Come experience mountains and canyons, desert and dunes, night skies and spectacular vistas within a place unlike any other. 
    Guadalupe Mountains National Park protects the world's most extensive Permian fossil reef, the four highest peaks in Texas, an environmentally 
    diverse collection of flora and fauna, and the stories of lives shaped through conflict, cooperation and survival.");
    
Insert into park values(null, 'Haleakala National Park', 'Hawaii', 1961, '/images/haleakala.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Sunrise-on-Haleakala.jpg', 
    'Credit: drewsulockcreations/ iStock', 
    "This special place vibrates with stories of ancient and modern Hawaiian culture and protects the bond between the land and its people. 
    The park also cares for endangered species, some of which exist nowhere else. Come visit this special place - renew your spirit 
    amid stark volcanic landscapes and sub-tropical rain forest with an unforgettable hike through the backcountry.");
    
Insert into park values(null, 'Hawaii Volcanoes National Park', 'Hawaii', 1916, '/images/hawaii.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Lava-sunrise-on-the-southeast-rift-zone-of-Kilauea-volcano.jpg', 
    'Credit: Yvonne Baur/ Shutterstock', 
    "Hawai'i Volcanoes National Park protects some of the most unique geological, biological, and cultural landscapes in the world. 
    Extending from sea level to 13,677 feet, the park encompasses the summits of two of the world's most active volcanoes - Kilauea and Mauna Loa.");
    
Insert into park values(null, 'Hot Springs National Park', 'Arkansas', 1832, '/images/hot_springs.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Waterfall-at-Hot-Springs-National-Park.jpg', 
    'Credit: Zack Frank/Shutterstock', 
    "Hot Springs National Park has a rich cultural past. The grand architecture of our historic bathhouses is equally matched by the natural 
    curiosities that have been drawing people here for hundreds of years. Ancient thermal springs, mountain views, incredible geology, 
    forested hikes, and abundant creeks - all in the middle of town - make Hot Springs National Park a unique and beautiful destination.");
    
Insert into park values(null, 'Indiana Dunes National Park', 'Indiana', 2019, '/images/indiana.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Lake-Michigan-shoreline-in-Indiana-Dunes-National-Lakeshore-Park.jpg', 
    'Credit: Anna Westman/Shutterstock', 
    "Indiana Dunes National Park hugs 15 miles of the southern shore of Lake Michigan and has much to offer. Whether you enjoy scouting for 
    rare species of birds or flying kites on the sandy beach, the national park's 15,000 acres will continually enchant you.  
    Hikers will enjoy 50 miles of trails over rugged dunes, mysterious wetlands, sunny prairies, meandering rivers and peaceful forests.");
    
Insert into park values(null, 'Isle Royale National Park', 'Michigan', 1940, '/images/isle.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Rock-Harbor-Lighthouse--Isle-Royale-National-Park.jpg', 
    'Credit: Steven Schremp/ Shutterstock', 
    "Explore a rugged, isolated island, far from the sights and sounds of civilization. Surrounded by Lake Superior, Isle Royale offers 
    unparalleled solitude and adventures for backpackers, hikers, boaters, kayakers, canoeists and scuba divers. Here, amid stunning 
    scenic beauty, you'll find opportunities for reflection and discovery, and make memories that last a lifetime.");
    
Insert into park values(null, 'Joshua Tree National Park', 'California', 1994, '/images/joshua.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Joshua-Tree-desert-landscape.jpg', 
    'Credit: Schroptschop/ iStock', 
    "Two distinct desert ecosystems, the Mojave and the Colorado, come together in Joshua Tree National Park. A fascinating variety of plants 
    and animals make their homes in a land sculpted by strong winds and occasional torrents of rain. Dark night skies, a rich cultural history, 
    and surreal geologic features add to the wonder of this vast wilderness in southern California. Come explore for yourself.");
    
Insert into park values(null, 'Katmai National Park and Preserve', 'Alaska', 1918, '/images/katmai.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Grizzly-Bears-at-Katmai-National-Park.jpg', 
    'Credit: Manamana/ Shutterstock', 
    "A landscape is alive underneath our feet, filled with creatures that remind us what it is to be wild. Katmai was established in 
    1918 to protect the volcanically devastated region surrounding Novarupta and the Valley of Ten Thousand Smokes. Today, Katmai National 
    Park and Preserve also protects 9,000 years of human history and important habitat for salmon and thousands of brown bears.");
    
Insert into park values(null, 'Kenai Fjords National Park', 'Alaska', 1980, '/images/kenai.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Spire-Cove-located-within-Kenai-Fjords-National-Park.jpg', 
    'Credit: Tomasz Wozniak/ Shutterstock', 
    "At the edge of the Kenai Peninsula lies a land where the ice age lingers. Nearly 40 glaciers flow from the Harding Icefield, Kenai Fjords' 
    crowning feature. Wildlife thrives in icy waters and lush forests around this vast expanse of ice. Sugpiaq people relied on these resources to 
    nurture a life entwined with the sea. Today, shrinking glaciers bear witness to the effects of our changing climate.");
     
Insert into park values(null, 'Kobuk Valley National Park', 'Alaska', 1980, '/images/kobuk.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Kobuk-Valley-National-Park.jpg', 
    'Credit: NPS', 
    "Caribou, sand dunes, the Kobuk River, Onion Portage - just some of the facets of Kobuk Valley National Park. Half a million caribou 
    migrate through, their tracks crisscrossing sculpted dunes. The Kobuk River is an ancient and current path for people and wildlife. For 9000 
    years, people came to Onion Portage to harvest caribou as they swam the river. Even today, that rich tradition continues.");
    
Insert into park values(null, 'Lake Clark National Park and Preserve', 'Alaska', 1980, '/images/lake_clark.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Brown-Bear-Hunting-for-Fish.jpg', 
    'Credit: Jim David/ Shutterstock', 
    "Lake Clark National Park and Preserve is a land of stunning beauty. Volcanoes steam, salmon run, 
    bears forage, and craggy mountains reflect in shimmering turquoise lakes. Here, too, local people and culture 
    still depend on the land and water. Venture into the park to become part of the wilderness.");
    
Insert into park values(null, 'Lassen Volcanic National Park', 'California', 1916, '/images/lassen.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Kings-s-Creek-Meadow--Lassen-Volcanic-National-Park.jpg', 
    'Credit: Dori Dumrong/ Shutterstockk', 
    "Lassen Volcanic National Park is home to steaming fumaroles, meadows freckled with wildflowers, clear mountain lakes, 
    and numerous volcanoes. Jagged peaks tell the story of its eruptive past while hot water continues to shape the land.");
    
Insert into park values(null, 'Mammoth Cave National Park', 'Kentucky', 1941, '/images/mammoth.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Mammoth-Cave-National-Park.jpg', 
    'Credit: benkrut/ iStock', 
    "Rolling hills, deep river valleys, and the worlds longest known cave system. Mammoth Cave National Park is home to thousands of years 
    of human history and a rich diversity of plant and animal life, earning it the title of UNESCO World Heritage Site and International Biosphere Reserve.");
    
Insert into park values(null, 'Mesa Verde National Park', 'Colorado', 1906, '/images/mesa.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Native-Anasazi-cliff-dwellings.jpg', 
    'Credit: sab3r/ iStock', 
    "Mesa Verde National Park was established in 1906 to preserve and interpret the archeological heritage of the Ancestral Pueblo people 
    who made it their home for over 700 years, from 600 to 1300 CE. Today, the park protects nearly 5,000 known archeological 
    sites, including 600 cliff dwellings. These sites are some of the most notable and best preserved in the United States.");
    
Insert into park values(null, 'Mount Rainier National Park', 'Washington', 1899, '/images/mount_rainier.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Mount-Rainier-National-Park-.jpg', 
    'Credit: Danita Delmont/ Shutterstock', 
    "Ascending to 14,410 feet above sea level, Mount Rainier stands as an icon in the Washington landscape. An active volcano, Mount Rainier 
    is the most glaciated peak in the contiguous U.S.A., spawning five major rivers. Subalpine wildflower meadows ring the icy volcano while 
    ancient forest cloaks Mount Rainier's lower slopes. Wildlife abounds in the park's ecosystems. A lifetime of discovery awaits.");
    
Insert into park values(null, 'National Park of American Samoa', 'American Samoa', 1988, '/images/national_samoa.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Pago-Pago--American-Samoa.jpg', 
    'Credit: emperorcosar/ Shutterstock', 
    "The National Park of American Samoa welcomes you into the heart of the South Pacific, to a world of sights, sounds, and experiences 
    that you will find in no other national park in the United States. Enjoy this unique national park and the welcoming people of 
    American Samoa. We are here to protect its rich culture and natural resources. Come explore them with us!");
    
Insert into park values(null, 'New River Gorge National Park and Preserve', 'West Virginia', 1978, '/images/new_river.jpg', 
	'https://www.nps.gov/npgallery/GetAsset/1CAFEA74-155D-451F-676F981980DD7740/proxy/hires?', 
    'Credit: nps.gov', 
    "A rugged, whitewater river flowing northward through deep canyons, the New River is among the oldest 
    rivers on the continent. The park encompasses over 70,000 acres of land along the New River, is rich in 
    cultural and natural history, and offers an abundance of scenic and recreational opportunities.");
    
Insert into park values(null, 'North Cascades National Park', 'Washington', 1968, '/images/north_cascades.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Diablo-lake.-North-Cascades-National-Park.jpg', 
    'Credit: Anna Abramskaya/ Shutterstock', 
    "Less than three hours from Seattle, an alpine landscape beckons. Discover communities of life adapted to moisture in the west 
    and recurring fire in the east. Explore jagged peaks crowned by more than 300 glaciers. Listen to cascading waters in forested 
    valleys. Witness a landscape sensitive to the Earth's changing climate. Help steward the ecological heart of the Cascades.");
    
Insert into park values(null, 'Olympic National Park', 'Washington', 1938, '/images/olympic.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Olympic-National-Park.jpg', 
    'Credit: Kelsey Neukum/ Shutterstock', 
    "With its incredible range of precipitation and elevation, diversity is the hallmark of Olympic National Park. Encompassing nearly a 
    million acres, the park protects a vast wilderness, thousands of years of human history, and several distinctly different ecosystems, 
    including glacier-capped mountains, old-growth temperate rain forests, and over 70 miles of wild coastline. Come explore!");
    
Insert into park values(null, 'Petrified Forest National Park', 'Arizona', 1962, '/images/petrified.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Blue-Mesa--Petrified-Forest-National-Park.jpg', 
    'Credit: Marisa Estivill/Shutterstock', 
    "Did you know that Petrified Forest is perfect for exploration and discovery? While the park has all the wonders known for 
    a century, there are many new adventures and discoveries to share. There are backcountry hikes into areas never open 
    before such as Red Basin. There are new exhibits that bring the stories to life. Come rediscover Petrified Forest!");
    
Insert into park values(null, 'Pinnacles National Park', 'California', 2013, '/images/pinnacles.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Last-Sunlight-on-Pinnacles-National-Park.jpg', 
    'Credit: yhelfman/ Shutterstock', 
    "Some 23 million years ago multiple volcanoes erupted, flowed, and slid to form what would become Pinnacles National Park. What remains 
    is a unique landscape. Travelers journey through chaparral, oak woodlands, and canyon bottoms. Hikers enter rare talus caves and emerge 
    to towering rock spires teeming with life: prairie and peregrine falcons, golden eagles, and the inspiring California condor.");
    
Insert into park values(null, 'Redwood National Park and State Park', 'California', 1968, '/images/redwood.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Giant-Sequoias-Forest.jpg', 
    'Credit: welcomia/ Shutterstock', 
    "Most people know Redwood as home to the tallest trees on Earth. But the parks also protect vast prairies, oak woodlands, wild riverways, 
    and nearly 40 miles of rugged coastline. People have lived in this verdant landscape since time immemorial. Together, the National Park 
    Service and California State Parks are managing and restoring these lands for the inspiration, enjoyment, and education of all.");
    
Insert into park values(null, 'Rocky Mountain National Park', 'Colorado', 1915, '/images/rocky.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Rocky-Mountain-National-Park-Estes-Park-Colorado.jpg', 
    'Credit: Evdoha_spb/ Shutterstock', 
    "Rocky Mountain National Park's 415 square miles encompass and protect spectacular mountain environments. Enjoy Trail Ridge Road -
    which crests at over 12,000 feet including many overlooks to experience the subalpine and alpine worlds - along with over 
    300 miles of hiking trails, wildflowers, wildlife, starry nights, and fun times. In a world of superlatives, Rocky is on top!");
    
Insert into park values(null, 'Saguaro National Park', 'Arizona', 1994, '/images/saguaro.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Saguaro-national-park-at-sunset.jpg', 
    'Credit: Anton Foltin/Shutterstock', 
    "Tucson, Arizona is home to the nation's largest cacti. The giant saguaro is the universal symbol of the American west. These majestic 
    plants, found only in a small portion of the United States, are protected by Saguaro National Park, to the east and west of the modern 
    city of Tucson. Here you have a chance to see these enormous cacti, silhouetted by the beauty of a magnificent desert sunset.");
    
Insert into park values(null, 'Sequoia & Kings Canyon National Parks', 'California', 1890, '/images/sequoia.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Mountain-with-cloud-at-sunset-in-Sequoia-National-Park.jpg', 
    'Credit: Songquan Deng/ Shutterstock', 
    "This dramatic landscape testifies to nature's size, beauty, and diversity—huge mountains, rugged foothills, deep canyons, 
    vast caverns, and the world's largest trees. The parks lie side by side in the southern Sierra Nevada east of the 
    San Joaquin Valley. Weather varies a lot by season and elevation, which ranges from 1,370' to 14,494'.");
   
Insert into park values(null, 'Shenandoah National Park', 'Virginia', 1935, '/images/shenandoah.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Cascades-on-South-River--Shenandoah-National-Park.jpg', 
    'Credit: Jon Bilous/ Shutterstock', 
    "Just 75 miles from the bustle of Washington, D.C., Shenandoah National Park is a land bursting with cascading waterfalls, 
    spectacular vistas, fields of wildflowers, and quiet wooded hollows. With over 200,000 acres of protected lands that are 
    haven to deer, songbirds, and black bear, there's so much to explore...and your journey begins right here!");
    
Insert into park values(null, 'Theodore Roosevelt National Park', 'North Dakota', 1978, '/images/theodore.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Sunrise-over-Theodore-Roosevelt-National-Park.jpg', 
    'Credit: ZakZeinert/Shutterstock', 
    "When Theodore Roosevelt came to Dakota Territory to hunt bison in 1883, he was a skinny, young, spectacled dude from New York. He could 
    not have imagined how his adventure in this remote and unfamiliar place would forever alter the course of the nation. The rugged 
    landscape and strenuous life that TR experienced here would help shape a conservation policy that we still benefit from today.");
    
Insert into park values(null, 'Virgin Islands National Park', 'Virgin Islands', 1956, '/images/virgin.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Aerial-view-of-picturesque-Trunk-bay.jpg', 
    'Credit: BlueOrange Studio/ Shutterstock', 
    "Virgin Islands National Park is more than just beautiful beaches. Hike to historic plantation sites to learn about a time when sugar 
    dominated the island. Visit the ancient petroglyphs carved by the Taino Indians. Come snorkel the coral reefs to discover hidden 
    marine life.  Two-thirds of the island of St. John is national park, making it a unique destination for visitors from around the world");
    
Insert into park values(null, 'Voyageurs National Park', 'Minnesota', 1975, '/images/voyageurs.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Sunset-in-Voyageurs-National-Park.jpg', 
    'Credit: BlueBarronPhoto/ Shutterstock', 
    "Voyageurs is a maze of interconnected water highways. Plan ahead before coming to this water-based park by bringing 
    your own watercraft, reserving a watercraft, or taking a park ranger boat tour.");
    
Insert into park values(null, 'White Sands National Park', 'New Mexico', 1933, '/images/white_sands.jpg', 
	'https://www.nps.gov/whsa/planyourvisit/images/WHSA_Soap_Tree_Yuccas_banner_1.jpg?maxwidth=1200&autorotate=false', 
    'Credit: nps.gov', 
    "Rising from the heart of the Tularosa Basin is one of the world's great natural wonders - the glistening white sands of New Mexico. 
    Great wave-like dunes of gypsum sand have engulfed 275 square miles of desert, creating the world's largest gypsum dunefield. 
    White Sands National Park preserves a major portion of this unique dunefield, along with the plants and animals that live here.");
        
Insert into park values(null, 'Wind Cave National Park', 'South Dakota', 1903, '/images/wind_cave.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Landscape-of-Wind-Cave-National-Park.jpg', 
    'Credit: Zack Frank/Shutterstock', 
    "Bison, elk, and other wildlife roam the rolling prairie grasslands and forested hillsides of one of America's oldest national parks. 
    Below the remnant island of intact prairie sits Wind Cave, one of the longest and most complex caves in the world. Named for barometric 
    winds at its entrance, this maze of passages is home to boxwork, a unique formation rarely found elsewhere.");
        
Insert into park values(null, 'Wrangell-St. Elias National Park and Preserve', 'Alaska', 1978, '/images/wrangell.jpg', 
	'https://blog.assets.thediscoverer.com/2019/02/Wrangell-St.Elias-NP-photographed-from-the-plane.jpg', 
    'Credit: Frank Fichtmueller/ Shutterstock', 
    "Wrangell-St. Elias is a vast national park that rises from the ocean all the way up to 18,008 ft. At 13.2 million acres, the park 
    is the same size as Yellowstone National Park, Yosemite National Park, and Switzerland combined! Within this wild landscape, people continue 
    to live off the land as they have done for centuries. This rugged, beautiful land is filled with opportunities for adventure.");
        
Insert into park values(null, 'Yellowstone National Park', 'Idaho, Montana, Wyoming', 1872, '/images/yellowstone.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Grand-Prismatic-Spring-in-Yellowstone.jpg', 
    'Credit: Justinreznick/ iStock', 
    "On March 1, 1872, Yellowstone became the first national park for all to enjoy the unique hydrothermal and geologic wonders. 
    In the depths of winter, the hot springs of Yellowstone appear as colorful jewels amongst the snow.");
        
Insert into park values(null, 'Yosemite National Park', 'California', 1890, '/images/yosemite.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Yosemite-National-Park-Valley.jpg', 
    'Credit: f11photo/ Shutterstock', 
    "Not just a great valley, but a shrine to human foresight, the strength of granite, the power of glaciers, the persistence of life, 
    and the tranquility of the High Sierra. First protected in 1864, Yosemite National Park is best known for its waterfalls, but within its 
    nearly 1,200 square miles, you can find deep valleys, grand meadows, ancient giant sequoias, a vast wilderness area, and much more.");
        
Insert into park values(null, 'Zion National Park', 'Utah', 1919, '/images/zion.jpg', 
	'https://blog.assets.thediscoverer.com/2019/03/Southwest-USA--Zion-National-Park.jpg', 
    'Credit: Peter Kunasz/ Shutterstock', 
    "Follow the paths where ancient native people and pioneers walked. Gaze up at massive sandstone cliffs of cream, pink, and red that soar 
    into a brilliant blue sky. Experience wilderness in a narrow slot canyon. Zion's unique array of plants and animals will enchant you as 
    you absorb the rich history of the past and enjoy the excitement of present day adventures.");
    
    
    
--  delete from park where id >= 63;
-- 	alter table park modify year_founded int;
-- 	update park set year_founded = 1980 where id = 5;
-- delete from user where id >= 5;
--  ALTER TABLE park AUTO_INCREMENT = 6;


drop table bucket_been;
-- drop table park;
drop table user;
drop table journal;

	use national_parks;
    
    select * from park;
    select * from user;
    select * from bucket_been;
    select * from journal;
