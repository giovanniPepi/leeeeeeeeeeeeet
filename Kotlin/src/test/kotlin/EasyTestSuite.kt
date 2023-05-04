import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test
import kotlin.test.assertEquals

class EasyTestSuite {

	@Test
	fun `Returns defang IP`() {
		val defangIp = DefangIP()
		assertEquals("1[.]1[.]1[.]1", defangIp.defangIPaddr("1.1.1.1"))
		assertEquals("255[.]100[.]50[.]0", defangIp.defangIPaddr("255.100.50.0"))
	}

	@Test
	fun `Returns operation values 2011`() {
		val operations = FourOperations()
		assertEquals(1, operations.finalValue(arrayOf("--X", "X++", "X++")))
		assertEquals(3, operations.finalValue(arrayOf("++X", "++X", "X++")))
		assertEquals(0, operations.finalValue(arrayOf("X++", "++X", "--X", "X--")))
	}

	@Test fun `Returns jewels in stones`() {
		val jewelsStones = JewelsStones()
		assertEquals(3, jewelsStones.numJewelsInStones("aA", "aAAbbbb"))
		assertEquals(0, jewelsStones.numJewelsInStones("z", "ZZ"))
	}

	@Test
	fun `Returns maximum words`() {
		val maximumWordsClass = MaximumWordsSentence()
		assertEquals(
			6,
			maximumWordsClass.mostWords(
				arrayOf(
					"alice and bob love leetcode",
					"i think so too",
					"this is great thanks very much"
				)
			)
		)
		assertEquals(
			3,
			maximumWordsClass.mostWords(arrayOf("please wait", "continue to fight", "continue to win"))
		)
	}

	@Test
	fun `Should parse goal string`() {
		val GoalParser = GoalParser()
		assertEquals("Goal", GoalParser.interpret("G()(al)"))
		assertEquals("Gooooal", GoalParser.interpret("G()()()()(al)"))
		assertEquals("alGalooG", GoalParser.interpret("(al)G(al)()()G"))
	}

	@Test
	fun `Should shuffle strings`() {
		val ShuffleString = ShuffleString()
		assertEquals(
			"leetcode",
			ShuffleString.restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3))
		)
		assertEquals("abc", ShuffleString.restoreString("abc", intArrayOf(0, 1, 2)))
	}

	@Test
	fun `Should return balanced strings`() {
		val BalancedStrings = BalancedStrings()
		assertEquals(4, BalancedStrings.balancedStringSplits("RLRRLLRLRL"))
		assertEquals(2, BalancedStrings.balancedStringSplits("RLRRRLLRLL"))
		assertEquals(1, BalancedStrings.balancedStringSplits("LLLLRRRR"))
	}

	@Test
	fun `Should correctly convert temperatures`() {
		val convertTemperature = ConvertTemperature()
		assertArrayEquals(doubleArrayOf(309.65, 97.7), convertTemperature.convertTemperature(36.50))
		assertArrayEquals(doubleArrayOf(395.26, 251.798), convertTemperature.convertTemperature(122.11))
	}

	@Test
	fun `Should return number of identical pairs`() {
		val getIdenticalPairs = NumberIdenticalPairs()
		assertEquals(4, getIdenticalPairs.numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
		assertEquals(6, getIdenticalPairs.numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
		assertEquals(0, getIdenticalPairs.numIdenticalPairs(intArrayOf(1, 2, 3)))
	}

	@Test
	fun `Should return the smallest even multiple`(){
		val smallestEvenMultiple = SmallestEvenMultiple()
		assertEquals(10, smallestEvenMultiple.smallestEvenMultiple(5))
		assertEquals(6, smallestEvenMultiple.smallestEvenMultiple(6))
	}

	@Test
	fun `Should return the minimum sum from the pair`(){
		val splitFour = SplitFourDigits()
		assertEquals(52, splitFour.minimumSum(2932))
		assertEquals(13, splitFour.minimumSum(4009))
	}

	@Test
	fun `Should return subtract product and sum`(){
		val exerciseClass = SubtractProductAndSum()
		assertEquals(15, exerciseClass.subtractProductAndSum(234))
		assertEquals(21, exerciseClass.subtractProductAndSum(4421))
		assertEquals(15, exerciseClass.efficientlySubtractProductAndSum(234))
		assertEquals(21, exerciseClass.efficientlySubtractProductAndSum(4421))
	}

	@Test
	fun `Count the digits that divide a number`(){
		val exerciseCountDigits = CounttheDigitsThatDivideaNumber()
		assertEquals(0, exerciseCountDigits.countDigits(54))
		assertEquals(1, exerciseCountDigits.countDigits(7))
		assertEquals(2, exerciseCountDigits.countDigits(121))
		assertEquals(4, exerciseCountDigits.countDigits(1248))
	}

	@Test
	fun `DiffElementSumDigit test`(){
		val exerciseDiffElem = DiffElemenSumDigitSum()
		assertEquals(9, exerciseDiffElem.differenceOfSum(intArrayOf(1, 15, 6, 3)))
		assertEquals(0, exerciseDiffElem.differenceOfSum(intArrayOf(1, 2, 3, 4)))
		assertEquals(9, exerciseDiffElem.differenceOfSum(intArrayOf(10,4,4,7,7,1,5,8,3,5)))
		assertEquals(3708, exerciseDiffElem.differenceOfSum(intArrayOf(12,97,48,72,31,70,1,9,78,28,1,30,82,17,43,44,53,12,73,16,74,24,79,9,51,77,36,38,81,38,69,60,29,21,66,6,62,55,13,90,66,7,15,15,60,76,44,30,6,86,87,59,88,36,32,35,67,13,79,43,27,2,97,41,4,44,91,11,5,48,38,64,9,90,39,28,50,57,60,4,99,44,39,12,95,32,66,100,45,42,22,35,65,7,49,43,41,40,64,78)))
		assertEquals(117486, exerciseDiffElem.differenceOfSum(intArrayOf(145,125,330,264,316,339,351,198,194,154,83,438,125,151,164,123,189,144,196,344,328,184,189,300,447,34,154,452,283,419,434,495,191,184,347,373,208,146,386,186,208,82,4,38,14,192,295,462,320,212,289,355,424,327,273,271,399,471,483,140,479,76,291,36,231,11,146,103,366,122,83,382,341,46,166,371,321,328,415,467,128,416,240,97,2,115,374,135,417,3,441,13,26,196,336,168,294,111,99,73,123,188,22,184,315,344,258,359,135,143,82,199,246,313,146,325,24,202,162,381,76,435,153,427,9,301,436,291,130,82,254,126,303,167,94,117,357,478,159,412,214,22,372,302,199,146,309,100,457,208,206,452,322,469,389,437,459,411,377,462,256,255,64,226,366,454,481,116,365,491,316,122,137,110,334,41,272,259,77,256,443,366,346,257,134,446,65,11,46,226,128,497,445,428,425,282,349,242,459,82,152,463,335,109,349,418,74,120,118,316,222,155,245,217,364,175,111,420,354,443,314,208,9,111,477,334,135,220,133,185,130,347,273,334,474,352,266,465,62,187,137,50,7,352,391,346,471,73,206,139,22,123,118,128,448,318,218,204,58,281,140,147,448,103,4,378,189,174,16,116,400,460,97,137,476,49,275,481,207,164,58,210,226,59,51,147,267,408,2,226,143,412,204,14,496,327,58,495,115,26,375,482,55,394,223,136,49,90,435,77,390,470,7,313,452,95,6,371,223,424,150,201,270,249,122,244,223,297,278,399,341,153,402,352,191,482,136,370,182,351,334,48,336,117,138,270,190,313,52,397,478,403,237,221,41,319,340,122,31,281,156,263,407,292,293,494,67,201,417,339,357,245,331,338,431,267,168,226,221,13,15,42,67,276,210,447,299,183,316,48,366,3,234,376,214,118,89,449,279,290,298,334,469,300,355,300,479,172,12,75,148,191,300,340,125,203,326,315,450,72,71,481,108,310,102,273,260,85,435,378,108,148,433,91,233,405,348,130,41,312,88,171,285,418,401,87,33,364,322,187,49,298,405,372,351,278,434,377,33,499,330,204,126,441,203,275,84,193,166,428,162,147,372,205,422,375,167,54,196,344,93,416,443,281,234,128,236,319,328,321,165,70,134,315,363,242,177,174,421,227)))
		assertEquals(1997082, exerciseDiffElem.differenceOfSum(intArrayOf(1618,545,1473,1976,1643,809,243,1652,358,1723,1749,1649,749,1199,607,1887,979,990,1557,257,966,1270,1445,1784,281,1602,1367,1752,1942,1541,180,813,1265,719,1915,1292,1152,485,1685,228,1026,1483,1655,1766,953,587,1368,132,1906,1179,497,561,1575,1395,704,623,1163,1799,1910,1701,1157,930,1324,1453,1581,1804,634,1417,62,1238,171,376,1474,1702,1697,954,530,1944,815,1011,956,922,759,909,759,1637,251,938,966,53,1721,584,509,1846,1199,426,312,1461,1891,1256,1070,450,1847,98,486,1315,867,1999,1873,790,520,1189,1490,885,1739,1533,351,1735,1861,159,1820,566,1266,384,374,1917,1300,1273,1911,1322,1785,1546,1330,1494,1010,793,822,1826,696,832,474,1628,1359,1280,43,1016,519,1465,1842,1824,370,672,1579,1222,969,968,1798,341,972,1623,1029,519,1429,440,929,1363,1611,1221,894,757,1709,546,1224,731,1289,618,1748,1789,454,359,852,500,320,758,1239,367,1451,75,207,490,1554,1119,1420,944,1868,650,1239,605,1084,1086,495,1871,1223,1695,225,78,476,1324,1436,1343,859,1871,215,91,162,1543,1174,102,256,1572,1024,790,224,454,1283,1023,1441,775,1095,934,445,1968,1519,1436,1556,872,1777,1955,665,188,1550,389,169,599,358,1493,124,1830,27,1617,420,1446,1048,1643,1650,167,869,1808,43,39,1917,1260,1041,1301,668,192,826,90,939,1094,564,946,257,1609,839,1004,1986,563,162,1252,22,574,1711,575,1389,1143,73,1304,1069,257,122,1323,1501,940,827,829,1240,1579,589,131,188,650,863,657,1387,191,1952,1210,1119,51,343,1013,1543,678,1947,618,652,1939,18,193,673,1697,560,510,1157,1800,978,730,1554,717,379,371,1150,419,460,1957,1992,1242,1739,432,1902,1295,1115,1846,61,1813,1682,1033,908,382,1513,1196,141,1706,1419,1469,996,1805,1546,961,1359,1497,1648,218,166,444,288,1407,225,599,1853,1017,1058,1820,561,834,749,398,605,304,720,435,332,98,1943,1451,928,1666,1134,1771,1551,145,998,180,645,544,106,395,69,470,1595,1480,1859,657,1344,1086,1518,1532,1474,70,320,1644,1078,1289,731,1366,93,1285,460,1136,697,1823,597,1209,902,662,1476,74,734,1021,1010,1915,107,1188,819,604,820,1994,447,570,356,55,110,1711,1116,1996,1904,1339,1286,450,1037,928,1265,1394,1379,1020,1110,705,222,1834,1338,1800,1402,473,1375,898,1982,509,1541,649,1524,162,1192,419,807,1253,168,1159,468,452,57,1151,538,388,1724,1424,919,1958,1516,931,1670,1412,1538,790,327,49,424,1656,1766,925,1322,1274,1510,382,1001,1136,1759,380,703,1337,1777,834,21,511,1972,1346,435,1555,169,1869,650,7,227,1906,477,1063,1474,1537,1733,1713,891,1860,1314,136,1115,1748,711,1927,1501,219,1115,1721,1326,1558,1383,482,321,1599,1914,127,1798,1262,1772,39,1053,8,752,752,1792,399,868,1476,940,1638,1345,445,1743,1239,577,900,1774,1922,364,1375,1558,1701,603,1997,193,1206,841,1964,1233,189,1483,1307,1504,795,263,981,386,583,1941,515,1415,1058,1512,1575,357,951,392,1024,1222,97,1205,913,592,389,1565,1834,390,795,685,1939,109,1019,1843,668,303,390,195,481,240,1311,28,1337,891,1241,758,807,460,355,567,510,64,1677,1773,1862,1326,1584,1250,216,934,199,128,1821,1596,510,478,1734,641,1364,1923,1615,1278,783,1095,1489,1431,1115,913,1291,498,457,1564,1494,742,736,74,1306,1678,951,403,1321,637,515,1358,1927,1981,601,223,1707,1045,1243,1219,1021,337,190,82,1721,132,335,510,991,1946,237,1365,1460,1848,549,1639,1597,1646,882,208,1787,751,706,640,22,1497,1665,1346,732,1190,727,613,1685,1471,1407,1701,107,1746,1849,1,1437,1597,743,457,1326,1069,933,525,506,543,1638,1775,799,406,1709,1155,79,588,736,1468,1015,1074,1403,1903,335,138,1540,870,752,1428,949,474,1528,1014,306,1147,1610,459,464,1789,109,1212,685,1022,1939,589,88,1741,790,683,1712,193,1527,1019,1753,446,1296,1981,2000,830,434,1937,397,871,1377,1926,1267,317,1800,331,1330,473,834,193,1729,490,977,698,1632,1649,1450,704,1825,707,1524,1436,1026,104,196,494,363,1699,1469,747,1448,1907,1298,1835,806,1246,1039,34,1679,378,4,16,1745,23,89,1677,606,785,620,491,590,1454,177,818,587,1124,1489,1425,1804,1288,1745,1714,1332,1387,639,1618,1355,1609,52,1957,366,1904,859,785,1673,978,613,1046,1668,1850,947,678,172,666,832,1750,1791,551,1225,1660,940,1089,575,67,1737,1096,1673,1681,481,768,1114,749,349,1955,39,1902,403,948,212,952,365,357,1829,47,1067,1874,1729,1469,754,959,269,667,913,1181,1132,1769,1224,1151,20,1585,55,518,1885,439,1250,35,262,1229,671,808,1041,1328,412,1683,1126,1242,1740,254,1614,1618,1298,175,1110,1666,722,523,1379,407,1075,790,1618,1108,1135,1674,1138,1486,1141,548,13,1051,1305,1628,1498,72,829,1884,654,859,1296,513,927,1948,995,1344,567,1748,557,1219,1930,1079,906,877,62,479,284,1220,204,1818,1152,1616,258,1406,1730,1788,1758,98,593,1374,1391,1561,451,118,856,509,1668,1146,333,1938,1237,343,488,1402,1827,176,28,1151,1802,1235,413,112,1795,1439,692,1265,1075,1230,78,678,666,1328,167,19,443,1160,1067,1774,1601,848,1096,936,182,1628,1286,1622,797,1839,807,1846,430,1354,1141,1716,1544,186,113,1186,1688,1290,1031,801,208,1740,1722,1043,1036,645,1773,1768,1101,210,1822,518,895,1447,805,1658,1939,660,425,1197,1269,490,1537,294,474,1938,85,707,945,294,943,378,1406,1385,814,1115,1618,40,1493,740,671,1134,931,1394,1399,501,628,379,1779,1379,1772,1577,860,747,1401,85,1851,53,1440,1642,660,651,1911,1532,1301,779,1118,390,1670,1751,548,737,1041,878,1153,1382,1390,986,1673,169,1598,1067,422,1882,986,732,162,198,307,1606,1125,923,1227,721,161,954,879,1235,1415,1025,1019,1247,736,1470,1513,80,113,698,1750,884,917,23,1251,1340,1538,279,284,342,1209,1943,578,1948,184,1887,1087,302,792,1441,766,781,1690,1143,755,697,640,1145,73,1739,1453,264,639,206,645,697,815,642,1569,1195,1421,183,804,1938,892,791,910,1095,490,251,792,625,491,102,457,1178,1495,593,159,77,1155,1459,1673,1289,754,1383,1189,1546,1748,1628,1777,928,1975,1721,1326,1710,1254,1787,256,1566,1861,860,23,1174,1256,1348,1594,1632,1024,227,1512,1699,1758,690,888,132,120,1920,1392,1210,951,1425,1229,1235,1279,1660,1225,1900,1114,1396,859,794,297,1021,829,225,773,1884,1803,1274,1890,168,1687,167,1338,1389,1107,958,1765,636,639,769,660,1655,201,545,263,1880,344,1302,1190,1863,340,1502,493,1237,1652,826,1660,1836,964,785,337,750,1372,466,1281,635,1504,1420,1254,1540,1566,1071,27,778,808,562,555,1268,1255,372,1968,1619,347,114,562,1054,1756,1221,896,694,337,676,619,1559,573,1035,1016,1684,1622,1015,1585,1046,1174,693,55,1014,1153,262,661,94,464,637,667,1074,1031,1181,712,992,1693,1176,915,1943,1888,188,795,436,1003,684,134,1299,1898,1653,1872,76,818,120,557,1391,1344,528,1704,1918,1444,1833,81,947,1629,1260,1610,932,185,219,731,1526,1695,429,910,734,1079,1191,211,965,1843,100,654,655,374,1009,543,1952,1656,1786,1199,940,1787,911,599,1150,842,1855,1357,1025,211,1829,1321,507,882,1975,104,1939,1526,1909,1679,327,1363,628,377,1739,1090,1647,373,1308,951,42,1404,378,388,1268,1283,1249,198,521,953,314,1523,1052,731,1428,1702,1120,736,701,1813,921,53,892,472,351,214,679,1265,243,56,462,1741,1594,1098,1616,1467,1956,151,1926,1369,1324,1727,797,864,1661,556,309,1810,244,850,1583,438,1090,372,79,938,192,330,1518,75,493,76,1112,1412,1091,1506,1948,362,202,1236,100,1288,1477,1763,383,525,636,563,502,1566,708,640,1630,1791,558,119,1469,1274,1763,1321,215,649,146,1588,195,668,1686,1343,583,377,115,1625,860,18,1677,483,1041,16,1390,1789,182,1414,736,127,183,1513,1558,1410,1769,402,208,1352,1595,461,1579,980,920,395,495,34,587,233,92,568,869,1897,1005,711,366,1143,1595,470,246,1466,613,972,361,1959,714,284,1723,515,574,505,409,282,1564,1528,1414,1488,1778,651,319,858,52,1616,955,1077,1725,1908,417,1643,1858,1512,1734,239,497,1699,473,1770,1158,576,1861,1435,1063,611,464,1091,537,1221,579,823,69,1830,425,143,584,1756,269,868,553,1658,866,88,257,190,1904,1597,1899,1818,867,461,1929,375,1420,1498,1386,1235,1104,1396,481,1135,200,439,916,1121,1428,1566,1778,854,464,1425,213,1619,686,1123,384,1063,480,1226,1308,909,1943,259,89,1739,46,48,965,1106,1208,1187,656,269,922,1577,1358,754,210,32,1054,1794,344,146,593,785,1006,1391,1404,1365,1581,142,1450,1168,545,484,1385,1908,1725,1578,258,1630,432,32,404,1961,938,1859,82,1847,188,1194,1129,1030,1356,1981,999,1315,1271,35,1096,657,1444,1840,1861,1396,1844,1449,1183,348,1969,1895,1630,691,1289,1786,567,1737,158,1742,1464,1000,1483,1478,1569,1206,23,1894,395,1856,626,1184,82,131,1848,1465,1826,1653,584,1194,782,1297,226,1567,790,985,1976,739,1105,998,1728,1036,1731,1485,1903,1451,1445,227,722,87,1629,359,659,1340,1478,53,1420,1234,1443,1517,934,419,770,12,777,970,92,364,1112,315,1615,791,609,1822,1819,29,652,1781,1475,501,1178,97,887,108,623,220,490,990,1971,1979,594,1331,1963,966,1778,1198,1960,1654,502,792,1104,661,1723,1184,1862,410,102,820,157,1084,532,676,1326,1160,1195,1510,940,478,1412,500,1095,817,666,1500,809,130,1098,457,179,1550,42,1551,1838,36,1077,1293,688,1649,352,864,1158,874,1761,431,916,1571,500,1518,534,619,260,1032,1025,1013,1301,170,1641,1346,385,1107,76,365,1289,99,1659,596,339,1246,1156,281,1614,1159,333,1318,603,1279,1873,356,1213,730,311,482,1138,1146,459,1349,523,153,550,951,714,573,987,198,1185,932,1996,1180,274,769,1701,1008,194,321,1175,995,1783,265,1336,1538,1618,1504,1806,1558,651,859,1940,183,651,1595,1587,1233,794,1783,1913,1964,1437,1734)))
	}

	@Test
	fun `SumOddSubArray Test`(){
		val exerciseSumOdd = SumOddSubarrays()
		assertEquals(58, exerciseSumOdd.sumOddLengthSubarrays(intArrayOf(1,4,2 ,5, 3)))
	}
}
