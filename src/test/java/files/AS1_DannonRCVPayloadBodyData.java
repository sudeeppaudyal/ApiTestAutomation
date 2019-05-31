package files;

public class AS1_DannonRCVPayloadBodyData {

	public static String getPatchDataAS1MM_MinimalFields() {
		String b = "{\r\n" + "  \"arrival-date-time\": \"2019-02-26T02:06:30.000-05:00\",\r\n"
				+ "  \"net-pounds\": 44500,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1638\r\n" + "  },\r\n"
				+ "  \"receive-date-time\": \"2019-02-26T02:06:30.000-05:00\",\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"pounds-per-ticket\": 42000,\r\n" + "        \"ticket-number\": \"0012  \"\r\n" + "  }],\r\n"
				+ "   \"measurements\": [{\r\n" + "    \"butterfat\": 4.1,\r\n" + "    \"other-solids\": 22.5\r\n"
				+ "  }]\r\n" + "}";

		return b;

	}

	public static String getPatchDataAS1MM_MinimalFields2Manis() {
		String b = "{\r\n" + "  \"arrival-date-time\": \"2019-01-14T02:06:30.000-05:00\",\r\n"
				+ "  \"net-pounds\": 44000,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1639\r\n" + "  },\r\n"
				+ "  \"receive-date-time\": \"2019-01-14T02:06:30.000-05:00\",\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"pounds-per-ticket\": 42000,\r\n" + "        \"ticket-number\": \"0146\"\r\n" + "  },\r\n"
				+ "   {\r\n" + "    \"compartment\": \"SINGLE\",\r\n" + "    \"division-number\": \"DIV10022\",\r\n"
				+ "    \"note\": \"supplier is N1\",\r\n" + "    \"pounds-per-ticket\": 500,\r\n"
				+ "    \"ticket-number\": \"71\"\r\n" + "   }],\r\n" + "   \"measurements\": [{\r\n"
				+ "    \"butterfat\": 4.1,\r\n" + "    \"other-solids\": 22.5\r\n" + "  }\r\n" + "  ]\r\n" + "}";

		return b;

	}

	public static String getPatchDataAS1MM2FieldsOnly() {

		String b = "{\r\n" + "  \"net-pounds\": 25591,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1639\r\n" + "}\r\n"
				+ "}";

		return b;

	}

	public static String getPatchDataMilkRCV_MinFields() {

		String b = "{\r\n" + "  \"receive-date-time\": \"2019-01-24T02:06:30.000-06:00\",\r\n"
				+ "  \"net-pounds\": 25591,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1638\r\n" + "}\r\n" + "}";

		return b;
	}

	public static String getPatchDataMilkRCV_RejectMostMilk() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-03-16T02:06:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-03-16T02:06:30.000-05:00\",\r\n"
				+ "  \"bay\": \"South Bay - A\",\r\n" + "  \"bill-to\":{\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"Bill To Plant 1\"\r\n" + "  },\r\n" + "  \"btu\": \"BTU North\",\r\n"
				+ "  \"departure-date-time\": \"2018-03-16T02:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Driver Joe\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 42500,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"PARTIAL\",\r\n"
				+ "  \"hose-screen\": \"TWO\",\r\n" + "  \"meter\": \"ONE\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"no-net-weight-reason\": \"METER_INOPERABLE\",\r\n" + "  \"note\": \"1234567890\",\r\n"
				+ "  \"plant\": {\r\n" + "    \"id\": 1639,\r\n" + "    \"name\": \"Notify Plant 1 - Company 1\"\r\n"
				+ "  },\r\n" + "  \"producer\": \"Brody Farms\",\r\n"
				+ "  \"receive-date-time\": \"2019-05-24T02:06:30.000-05:00\",\r\n"
				+ "  \"receiver-initials\": \"TC\",\r\n" + "  \"reclassify-code\": \"ORGANIC2RBST\",\r\n"
				+ "  \"reject-code\": \"FLAVOR\",\r\n" + "  \"reject-reason\": \"Sour flavor\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 439876,\r\n"
				+ "  \"shipping-date-time\": \"2019-05-16T02:06:30.000-05:00\",\r\n" + "  \"silo-pounds\": 10000,\r\n"
				+ "  \"silo-pounds2\": 12000,\r\n" + "  \"silo-pounds3\": 20000,\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112233\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"Notify Plant 1 - Company 1\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"compartment\": \"SINGLE\",\r\n" + "    \"division-number\": \"DIV10022\",\r\n"
				+ "    \"note\": \"Only one compartment\",\r\n" + "    \"pounds-per-ticket\": 42000,\r\n"
				+ "    \"supplier\": {\r\n" + "      \"id\": 1636,\r\n" + "        \"name\": \"Dannon Company\"\r\n"
				+ "    },\r\n" + "    \"ticket-number\": \"789689\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n"
				+ "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataMilkRCV_NoRejectNoManifests() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-01T02:06:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-01T02:06:30.000-05:00\",\r\n"
				+ "  \"bay\": \"South Bay - A\",\r\n" + "  \"bill-to\":{\r\n" + "    \"id\": 1639,\r\n"
				+ "    \"name\": \"Bill To Plant 1\"\r\n" + "  },\r\n" + "  \"btu\": \"BTU North\",\r\n"
				+ "  \"departure-date-time\": \"2018-06-01T02:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Driver Joe\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 42500,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"hauler-name\": \"abc\",\r\n"
				+ "  \"holdover\": \"PARTIAL\",\r\n" + "  \"hose-screen\": \"TWO\",\r\n" + "  \"meter\": \"ONE\",\r\n"
				+ "  \"milk-type\": \"RBF\",\r\n" + "  \r\n" + "  \"note\": \"1234567890\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"producer\": \"Danucer 1\",\r\n"
				+ "  \"receive-date-time\": \"2019-05-24T02:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RW\",\r\n" + "  \"reclassify-code\": \"ORGANIC2RBST\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 439876,\r\n"
				+ "  \"shipping-date-time\": \"2018-06-01T02:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112233\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"measurements\": [{\r\n" + "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n"
				+ "    \"casein\": 12.1,\r\n" + "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataMilkRCV_StandardFields() {

		String b = "{\r\n" + "  \"receive-date-time\": \"2019-01-24T02:06:30.000-06:00\",\r\n"
				+ "  \"export-flag\": false,\r\n" + "  \"milk-type\": \"OGRFD\",\r\n"
				+ "   \"contract-supplier\": {\r\n" + "    \"id\": 1640,\r\n" + "    \"name\": \"Dannon\"\r\n"
				+ "  },\r\n" + "  \"net-pounds\": 42000,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"test\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"pounds-per-ticket\": 41050,\r\n" + "    \"supplier\": {\r\n" + "      \"id\": 1636,\r\n"
				+ "        \"name\": \"Dannon Company\"\r\n" + "    },\r\n" + "    \"ticket-number\": \"152  \"\r\n"
				+ "  }],\r\n" + "  \"measurements\": [{\r\n" + "    \"butterfat\": 4.1,\r\n"
				+ "    \"other-solids\": 22.5\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataRCV_MostMilkThisIsAGoodOne() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-11-08T02:08:30.000-06:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-11-08T02:01:30.000-06:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "   \"contract-supplier\": {\r\n" + "    \"id\": 190,\r\n"
				+ "    \"name\": \"Dannon\"\r\n" + "  },\r\n"
				+ "  \"departure-date-time\": \"2018-11-08T12:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 32001,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2019-02-26T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-11-08T01:06:30.000-06:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"BOTH\",\r\n"
				+ "    \"division-number\": \"54\",\r\n" + "    \"note\": \"Lorem ipsum dolorm quis,.\",\r\n"
				+ "    \"pounds-per-ticket\": 62500,\r\n" + "    \"supplier\": {\r\n" + "      \"id\": 1636\r\n"
				+ "    },\r\n" + "    \"ticket-number\": \"123489012\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 0,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataRCV_GoodOne_NoSupplier() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-11-08T02:08:30.000-06:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-11-08T02:01:30.000-06:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "   \"contract-supplier\": {\r\n" + "    \"id\": 190,\r\n"
				+ "    \"name\": \"Dannon\"\r\n" + "  },\r\n"
				+ "  \"departure-date-time\": \"2018-11-08T12:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 32001,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2018-12-12T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-11-08T01:06:30.000-06:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"BOTH\",\r\n"
				+ "    \"division-number\": \"54\",\r\n" + "    \"note\": \"Lorem ipsum dolorm quis,.\",\r\n"
				+ "    \"pounds-per-ticket\": 62500,\r\n" + "    \"supplier\": {\r\n" + "      \"id\": 1636\r\n"
				+ "    },\r\n" + "    \"ticket-number\": \"0122\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 0,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataRCV_GoodOne2ManisNoSupplier() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-11-08T02:08:30.000-06:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-11-08T02:01:30.000-06:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "   \"contract-supplier\": {\r\n" + "    \"id\": 190,\r\n"
				+ "    \"name\": \"Dannon\"\r\n" + "  },\r\n"
				+ "  \"departure-date-time\": \"2018-11-08T12:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 32001,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2018-12-12T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-11-08T01:06:30.000-06:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "   \"manifests\": [{\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"ticket-number\": \"756489\"\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"compartment\": \"SINGLE\",\r\n" + "    \"division-number\": \"DIV10022\",\r\n"
				+ "    \"note\": \"Supplier unknown\",\r\n" + "    \"pounds-per-ticket\": 2000,\r\n"
				+ "    \"ticket-number\": \"70089\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":34.564,\r\n" + "    \"casein\": 2.1,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 0,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataRCV_MultiMilk() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-14T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-14T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"Bay22\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "  \"departure-date-time\": \"2018-06-14T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 2500,\r\n"
				+ "  \"hauler-code\": \"H1\",\r\n" + "  \"holdover\": \"PARTIAL\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"ONE\",\r\n" + "  \"milk-type\": \"CNV\",\r\n"
				+ "  \"net-pounds\": 48220,\r\n" + "  \"note\": \"1234567890\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123456789\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2019-01-03T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"TC\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 435476,\r\n"
				+ "  \"shipping-date-time\": \"2018-06-14T01:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"WA\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112\",\r\n"
				+ "  \"tare-weight-per-scale\": 41000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"pounds-per-ticket\": 42040,\r\n" + "     \"supplier\": {\r\n" + "      \"id\": 1636,\r\n"
				+ "        \"name\": \"Dannon Company\"\r\n" + "    },\r\n" + "    \"ticket-number\": \"71\"\r\n"
				+ "  },\r\n" + "  {\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"supplier is N1\",\r\n"
				+ "    \"pounds-per-ticket\": 500,\r\n" + "     \"supplier\": {\r\n" + "      \"id\": 1640,\r\n"
				+ "        \"name\": \"Dannon Company\"\r\n" + "    },\r\n" + "    \"ticket-number\": \"71\"\r\n"
				+ "  }],\r\n" + "  \"measurements\": [{\r\n" + "    \"antibiotic\": \"AFLATOXIN\",\r\n"
				+ "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n"
				+ "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"butterfat\": 40.1,\r\n" + "    \"casein\": 12.5,\r\n" + "    \"protein\": 10.5,\r\n"
				+ "    \"solids-nonfat\": 3.348,\r\n" + "    \"total-solids\": 2.13,\r\n"
				+ "    \"use-for-settlement\": false\r\n" + "    }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataCreamRCV_NoMeasurements() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-08-06T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-08-06T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"bill-to\":{\r\n" + "    \"id\": 1639\r\n" + "  },\r\n" + "  \"btu\": \"54\",\r\n"
				+ "  \"departure-date-time\": \"2018-08-06T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 2750,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 10000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "  \"transfer-plant\": {\r\n" + "    \"id\": 1639,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "    \"manifests\": [{\r\n"
				+ "    \"compartment\": \"BOTH\",\r\n" + "    \"division-number\": \"9\",\r\n"
				+ "    \"note\": \"Lorem ipsum dolorm quis,.\",\r\n" + "    \"pounds-per-ticket\": 777,\r\n"
				+ "    \"ticket-number\": \"200\"\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataCreamRCV_MostFieldsRealIsh() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-08-06T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-08-06T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"bill-to\":{\r\n" + "    \"id\": 1639\r\n" + "  },\r\n" + "  \"btu\": \"54\",\r\n"
				+ "  \"departure-date-time\": \"2018-08-06T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": true,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"THREE\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 500,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n"
				+ "  \"receive-date-time\": \"2019-01-03T02:06:30.000-06:00\",\r\n"
				+ "  \"ready-for-settlement\": true,\r\n" + "  \"receiver-initials\": \"RWS\",\r\n"
				+ "  \"reclassify-code\": \"OTHER\",\r\n" + "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n"
				+ "  \"tanker-permit\": \"12345692\",\r\n" + "  \"tare-weight-per-scale\": 1000,\r\n"
				+ "  \"tractor-number\": \"02345\",\r\n" + "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "    \"manifests\": [{\r\n"
				+ "    \"ticket-number\": \"009\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 5,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  },\r\n"
				+ "  {\r\n" + "    \"butterfat\": 40.1,\r\n" + "    \"solids-nonfat\": 2.3148,\r\n"
				+ "    \"protein\": 10,\r\n" + "    \"use-for-settlement\": true\r\n" + "    }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataCreamRCV_NoManifestRealCase() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-08-06T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-08-06T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"bill-to\":{\r\n" + "    \"id\": 1639\r\n" + "  },\r\n" + "  \"btu\": \"54\",\r\n"
				+ "  \"departure-date-time\": \"2018-08-06T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": true,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"THREE\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 500,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n"
				+ "  \"receive-date-time\": \"2019-01-03T02:06:30.000-06:00\",\r\n"
				+ "  \"ready-for-settlement\": true,\r\n" + "  \"receiver-initials\": \"RWS\",\r\n"
				+ "  \"reclassify-code\": \"OTHER\",\r\n" + "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n"
				+ "  \"tanker-permit\": \"12345692\",\r\n" + "  \"tare-weight-per-scale\": 1000,\r\n"
				+ "  \"tractor-number\": \"02345\",\r\n" + "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "    \"manifests\": [{\r\n"
				+ "    \"ticket-number\": \"009\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 5,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  },\r\n"
				+ "  {\r\n" + "    \"butterfat\": 40.1,\r\n" + "    \"solids-nonfat\": 2.3148,\r\n"
				+ "    \"protein\": 10,\r\n" + "    \"use-for-settlement\": true\r\n" + "    }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataCreamRCV_NoWeight() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-06T02:06:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-06T02:06:30.000-05:00\",\r\n"
				+ "  \"bay\": \"South Bay - A\",\r\n" + "  \"bill-to\":{\r\n" + "    \"id\": 1639,\r\n"
				+ "    \"name\": \"Bill To Plant 1\"\r\n" + "  },\r\n" + "  \"btu\": \"BTU North\",\r\n"
				+ "  \"departure-date-time\": \"2018-06-06T02:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Driver Joe\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 42500,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"hauler-name\": \"abc\",\r\n"
				+ "  \"holdover\": \"PARTIAL\",\r\n" + "  \"hose-screen\": \"TWO\",\r\n" + "  \"meter\": \"ONE\",\r\n"
				+ "  \"milk-type\": \"RBF\",\r\n" + "  \"note\": \"1234567890\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"producer\": \"Danucer 1\",\r\n"
				+ "  \"receive-date-time\": \"2018-06-06T02:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RW\",\r\n" + "  \"reclassify-code\": \"ORGANIC2RBST\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 439876,\r\n"
				+ "  \"shipping-date-time\": \"2018-06-06T02:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112233\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"measurements\": [{\r\n" + "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n"
				+ "    \"casein\": 12.1,\r\n" + "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataCreamRCV_MostFields() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-20T02:08:30.000-06:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-20T02:01:30.000-06:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"bill-to\":{\r\n" + "    \"id\": 1639\r\n" + "  },\r\n" + "  \"btu\": \"54\",\r\n"
				+ "  \"departure-date-time\": \"2018-06-20T14:06:30.000-06:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"OGRFD\",\r\n"
				+ "  \"net-pounds\": 43000,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"po-number\": \"123aa\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2018-12-08T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-06-20T11:06:30.000-06:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "  \"transfer-plant\": {\r\n" + "    \"id\": 1639,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"compartment\": \"BOTH\",\r\n" + "    \"division-number\": \"54\",\r\n"
				+ "    \"note\": \"updateg\",\r\n" + "    \"pounds-per-ticket\": 6800,\r\n"
				+ "    \"ticket-number\": \"5\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 0,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"Lorem ipsuonts\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"PRODUCER\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";

		return b;

	}

	public static String getPatchDataCreamRCV_Export() {

		String b = "{\r\n" + "  \"bay\": \"125789323\",\r\n" + "  \"bill-to\":{\r\n" + "    \"id\": 1638\r\n"
				+ "  },\r\n" + "  \"btu\": \"54\",\r\n" + "  \"double-tripping\": true,\r\n"
				+ "  \"driver-code\": \"1345\",\r\n" + "  \"driver-name\": \"Rach\",\r\n"
				+ "  \"export-flag\": true,\r\n" + "  \"gmp-infraction\": \"Lorem ipsum\",\r\n"
				+ "  \"gross-pounds\": 100,\r\n" + "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"ONE\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"OGRFD\",\r\n"
				+ "  \"net-pounds\": 43500,\r\n" + "  \"note\": \"Lorem ip\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123aa\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2019-01-08T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n" + "  \"state-of-origin\": \"TX\",\r\n"
				+ "  \"tanker-last-wash-location\": \"135\",\r\n" + "  \"tanker-number\": \"12342\",\r\n"
				+ "  \"tanker-permit\": \"12345692\",\r\n" + "  \"tare-weight-per-scale\": 1000,\r\n"
				+ "  \"tractor-number\": \"02345\",\r\n" + "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"compartment\": \"BOTH\",\r\n" + "    \"division-number\": \"54\",\r\n"
				+ "    \"note\": \"updateg\",\r\n" + "    \"pounds-per-ticket\": 6800,\r\n"
				+ "    \"ticket-number\": \"5\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 8.5,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"123456789012341111\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";
		return b;

	}

	public static String getPatchDataPutReceiptMinCream() {

		String b = "{\r\n" + "  \"bay\": \"125789323\",\r\n" + "  \"bill-to\":{\r\n" + "    \"id\": 1638\r\n"
				+ "  },\r\n" + "  \"btu\": \"54\",\r\n" + "  \"double-tripping\": true,\r\n"
				+ "  \"driver-code\": \"1345\",\r\n" + "  \"driver-name\": \"Rach\",\r\n"
				+ "  \"export-flag\": true,\r\n" + "  \"gmp-infraction\": \"Lorem ipsum\",\r\n"
				+ "  \"gross-pounds\": 100,\r\n" + "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"ONE\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"OGRFD\",\r\n"
				+ "  \"net-pounds\": 43500,\r\n" + "  \"note\": \"Lorem ip\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "  },\r\n" + "  \"po-number\": \"123aa\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2019-01-08T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n" + "  \"state-of-origin\": \"TX\",\r\n"
				+ "  \"tanker-last-wash-location\": \"135\",\r\n" + "  \"tanker-number\": \"12342\",\r\n"
				+ "  \"tanker-permit\": \"12345692\",\r\n" + "  \"tare-weight-per-scale\": 1000,\r\n"
				+ "  \"tractor-number\": \"02345\",\r\n" + "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"compartment\": \"BOTH\",\r\n" + "    \"division-number\": \"54\",\r\n"
				+ "    \"note\": \"updateg\",\r\n" + "    \"pounds-per-ticket\": 6800,\r\n"
				+ "    \"ticket-number\": \"5\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"OTHER\",\r\n" + "    \"antibiotic-reading\": \"540\",\r\n"
				+ "    \"butterfat\":38.564,\r\n" + "    \"casein\": 2.2,\r\n" + "    \"coliform\":10,\r\n"
				+ "    \"compartment\": \"REAR\",\r\n" + "    \"cryogenic-test\":99.9,\r\n" + "    \"dmc\": 50,\r\n"
				+ "    \"flavor-comment\": \"Lorem i\",\r\n" + "    \"flavor-issue\": false,\r\n"
				+ "    \"hr1\": \"PINK\",\r\n" + "    \"hr3\":\"PINK\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 33.15,\r\n"
				+ "    \"lactic-acid\": 50.1,\r\n" + "    \"lactose\":5.554,\r\n" + "    \"lpc\": 1.1234567,\r\n"
				+ "    \"mun\": 10.1234567,\r\n" + "    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n"
				+ "    \"odor-issue\": false,\r\n" + "    \"other-solids\": 0,\r\n" + "    \"plc\": 500,\r\n"
				+ "    \"preliminary-incubation\": 0,\r\n" + "    \"protein\": 8.5,\r\n"
				+ "    \"ropy-milk-test24\": true,\r\n" + "    \"ropy-milk-test36\": true,\r\n"
				+ "    \"ropy-milk-test48\": true,\r\n" + "    \"sample\": \"123456789012341111\",\r\n"
				+ "    \"sediment\": 1,\r\n" + "    \"solids-nonfat\":1.542,\r\n"
				+ "    \"somatic-cell-count\": 20000,\r\n" + "    \"standard-plate-count\": 1000,\r\n"
				+ "    \"ta\": 0.123456,\r\n" + "    \"temperature\": 34.5,\r\n" + "    \"test-lab\": \"MA\",\r\n"
				+ "    \"tester-initials\": \"RW\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\":22.25,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Lor\",\r\n" + "    \"visual-issue\": \"false\"\r\n" + "  }]\r\n" + "}";
		return b;

	}

	public static String getPatchDataPutRejectMostOfCreamWorking() {

		String b = "{\r\n" + "  \"receive-date-time\": \"2019-01-24T02:06:30.000-06:00\",\r\n"
				+ "  \"export-flag\": false,\r\n" + "  \"milk-type\": \"OGRFD\",\r\n"
				+ "   \"contract-supplier\": {\r\n" + "    \"id\": 1640,\r\n" + "    \"name\": \"Dannon\"\r\n"
				+ "  },\r\n" + "  \"net-pounds\": 42000,\r\n" + "  \"plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"test\"\r\n" + "  },\r\n" + "  \"manifests\": [{\r\n"
				+ "    \"pounds-per-ticket\": 41050,\r\n" + "    \"supplier\": {\r\n" + "      \"id\": 1636,\r\n"
				+ "        \"name\": \"Dannon Company\"\r\n" + "    },\r\n" + "    \"ticket-number\": \"152  \"\r\n"
				+ "  }],\r\n" + "  \"measurements\": [{\r\n" + "    \"butterfat\": 4.1,\r\n"
				+ "    \"other-solids\": 22.5\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataPutReceiptMultiCream() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2019-06-11T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2019-06-11T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"Bay22\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "  \"departure-date-time\": \"2019-06-11T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 2500,\r\n"
				+ "  \"hauler-code\": \"H1\",\r\n" + "  \"holdover\": \"PARTIAL\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"ONE\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 40220,\r\n" + "  \"note\": \"1234567890\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639,\r\n" + "    \"name\": \"DanoneWave - Fort Worth\"\r\n" + "  },\r\n"
				+ "  \"po-number\": \"123456789\",\r\n" + "  \"producer\": \"Best Milk EVER!\",\r\n"
				+ "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2019-01-03T01:06:30.000-05:00\",\r\n"
				+ "  \"receiver-initials\": \"TC\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 435476,\r\n"
				+ "  \"shipping-date-time\": \"2019-06-11T01:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"WA\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112\",\r\n"
				+ "  \"tare-weight-per-scale\": 41000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"ticket-number\": \"756489\"\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"compartment\": \"SINGLE\",\r\n" + "    \"division-number\": \"DIV10022\",\r\n"
				+ "    \"note\": \"Supplier unknown\",\r\n" + "    \"pounds-per-ticket\": 200,\r\n"
				+ "    \"supplier\": {\r\n" + "      \"id\": 1636,\r\n" + "        \"name\": \"Dannon Company\"\r\n"
				+ "    },\r\n" + "    \"ticket-number\": \"70089\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"AFLATOXIN\",\r\n" + "    \"antibiotic-reading\": 3,\r\n"
				+ "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n" + "    \"coliform\": 33,\r\n"
				+ "    \"compartment\": \"SINGLE\",\r\n" + "    \"cryogenic-test\": -0.12333,\r\n"
				+ "    \"dmc\": 2211,\r\n" + "    \"flavor-comment\": \"Taste is fine\",\r\n"
				+ "    \"flavor-issue\": 0,\r\n" + "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"butterfat\": 40.1,\r\n" + "    \"solids-nonfat\": 3.348,\r\n"
				+ "    \"use-for-settlement\": true\r\n" + "    }]\r\n" + "}";

		return b;
	}

	public static String patchRequestGetDataSkimRCV_MostFields() {
		
		
		String b = "{\r\n" + 
				"  \"appt-date-time\": \"2018-08-06T02:08:30.000-05:00\",\r\n" + 
				"  \"arrival-date-time\": \"2018-08-06T02:01:30.000-05:00\",\r\n" + 
				"  \"bay\": \"125789323\",\r\n" + 
				"  \"bill-to\":{\r\n" + 
				"    \"id\": 1639\r\n" + 
				"  },\r\n" + 
				"  \"btu\": \"54\",\r\n" + 
				"  \"departure-date-time\": \"2018-08-06T12:06:30.000-05:00\",\r\n" + 
				"  \"double-tripping\": true,\r\n" + 
				"  \"driver-code\": \"1345\",\r\n" + 
				"  \"driver-name\": \"Rach\",\r\n" + 
				"  \"export-flag\": false,\r\n" + 
				"  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + 
				"  \"gross-pounds\": 100,\r\n" + 
				"  \"hauler-code\": \"H101\",\r\n" + 
				"  \"holdover\": \"WHOLE\",\r\n" + 
				"  \"hose-screen\": \"THREE\",\r\n" + 
				"  \"meter\": \"TWO\",\r\n" + 
				"  \"milk-type\": \"RBF\",\r\n" + 
				"  \"note\": \"Lorem ipsum\",\r\n" + 
				"  \"net-pounds\": 42000,\r\n" + 
				"  \"plant\": {\r\n" + 
				"    \"id\": 1638\r\n" + 
				"  },\r\n" + 
				"  \"po-number\": \"123aaa4567890123\",\r\n" + 
				"  \"producer\": \"Best Milk EVER!\",\r\n" + 
				"  \"receive-date-time\": \"2018-12-19T02:06:30.000-05:00\",\r\n" + 
				"  \"ready-for-settlement\": true,\r\n" + 
				"  \"receiver-initials\": \"RWS\",\r\n" + 
				"  \"reclassify-code\": \"OTHER\",\r\n" + 
				"  \"route-name\": \"12345\",\r\n" + 
				"  \"shipping-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n" + 
				"  \"state-of-origin\": \"TX\",\r\n" + 
				"  \"tanker-last-wash-location\": \"135\",\r\n" + 
				"  \"tanker-number\": \"12342\",\r\n" + 
				"  \"tanker-permit\": \"12345692\",\r\n" + 
				"  \"tare-weight-per-scale\": 1000,\r\n" + 
				"  \"tractor-number\": \"02345\",\r\n" + 
				"  \"transfer-plant\": {\r\n" + 
				"    \"id\": 1639,\r\n" + 
				"    \"name\": \"DanaaoneWave - McCarty\"\r\n" + 
				"  },\r\n" + 
				"    \"manifests\": [{\r\n" + 
				"    \"note\": \"Lorem ipsum dolorm quis,.\",\r\n" + 
				"    \"pounds-per-ticket\": 410,\r\n" + 
				"    \"ticket-number\": \"789689\"\r\n" + 
				"  }],\r\n" + 
				"  \"measurements\": [{\r\n" + 
				"    \"antibiotic\": \"OTHER\",\r\n" + 
				"    \"antibiotic-reading\": \"540\",\r\n" + 
				"    \"butterfat\":38.564,\r\n" + 
				"    \"casein\": 2.2,\r\n" + 
				"    \"coliform\":10,\r\n" + 
				"    \"compartment\": \"REAR\",\r\n" + 
				"    \"cryogenic-test\":99.9,\r\n" + 
				"    \"dmc\": 50,\r\n" + 
				"    \"flavor-comment\": \"Lorem i\",\r\n" + 
				"    \"flavor-issue\": false,\r\n" + 
				"    \"hr1\": \"PINK\",\r\n" + 
				"    \"hr3\":\"PINK\",\r\n" + 
				"    \"inhibitor-anitbiotic\": false,\r\n" + 
				"    \"lab-temperature\": 33.15,\r\n" + 
				"    \"lactic-acid\": 50.1,\r\n" + 
				"    \"lactose\":5.554,\r\n" + 
				"    \"lpc\": 1.1234567,\r\n" + 
				"    \"mun\": 10.1234567,\r\n" + 
				"    \"odor-comment\": \"Lorem ipsum dolor sit amet, cons\",\r\n" + 
				"    \"odor-issue\": false,\r\n" + 
				"    \"other-solids\": 0,\r\n" + 
				"    \"plc\": 500,\r\n" + 
				"    \"preliminary-incubation\": 0,\r\n" + 
				"    \"protein\": 0,\r\n" + 
				"    \"ropy-milk-test24\": true,\r\n" + 
				"    \"ropy-milk-test36\": true,\r\n" + 
				"    \"ropy-milk-test48\": true,\r\n" + 
				"    \"sample\": \"Lorem ipsuonts\",\r\n" + 
				"    \"sediment\": 1,\r\n" + 
				"    \"solids-nonfat\": 5.48,\r\n" + 
				"    \"somatic-cell-count\": 20000,\r\n" + 
				"    \"standard-plate-count\": 1000,\r\n" + 
				"    \"ta\": 0.123456,\r\n" + 
				"    \"temperature\": 34.5,\r\n" + 
				"    \"test-lab\": \"MA\",\r\n" + 
				"    \"tester-initials\": \"RW\",\r\n" + 
				"    \"ticket-sample\": \"PRODUCER\",\r\n" + 
				"    \"total-solids\":22.25,\r\n" + 
				"    \"use-for-settlement\": true,\r\n" + 
				"    \"visual-comment\": \"Lor\",\r\n" + 
				"    \"visual-issue\": \"false\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"butterfat\": 40.1,\r\n" + 
				"    \"solids-nonfat\": 2.3148,\r\n" + 
				"    \"total-solids\":12.25,\r\n" + 
				"    \"use-for-settlement\": true\r\n" + 
				"    }]\r\n" + 
				"}";
		
		
		return b;
		
	}
		
	public static String getPatchDataSkimRCV_NoMeasurements() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-14T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-14T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"125789323\",\r\n"
				+ "  \"bill-to\":{\r\n" + "    \"id\": 1638\r\n" + "  },\r\n" + "  \"btu\": \"54\",\r\n"
				+ "  \"departure-date-time\": \"2018-06-14T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": true,\r\n" + "  \"driver-code\": \"1345\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"Lorem ipsum\",\r\n" + "  \"gross-pounds\": 100,\r\n"
				+ "  \"hauler-code\": \"H101\",\r\n" + "  \"holdover\": \"WHOLE\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"TWO\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 32001,\r\n" + "  \"note\": \"Lorem ipsum\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1638\r\n" + "  },\r\n" + "  \"po-number\": \"123aaa4567890123\",\r\n"
				+ "  \"producer\": \"Best Milk EVER!\",\r\n" + "  \"ready-for-settlement\": false,\r\n"
				+ "  \"receive-date-time\": \"2018-12-12T01:06:30.000-05:00\",\r\n"
				+ "  \"receiver-initials\": \"RWS\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"12345\",\r\n"
				+ "  \"shipping-date-time\": \"2018-06-14T01:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"135\",\r\n"
				+ "  \"tanker-number\": \"12342\",\r\n" + "  \"tanker-permit\": \"12345692\",\r\n"
				+ "  \"tare-weight-per-scale\": 10000,\r\n" + "  \"tractor-number\": \"02345\",\r\n"
				+ "  \"transfer-plant\": {\r\n" + "    \"id\": 1638,\r\n"
				+ "    \"name\": \"DanaaoneWave - McCarty\"\r\n" + "  },\r\n" + "    \"manifests\": [{\r\n"
				+ "    \"compartment\": \"BOTH\",\r\n" + "    \"division-number\": \"1\",\r\n"
				+ "    \"note\": \"Lorem ipsum dolorm quis,.\",\r\n" + "    \"pounds-per-ticket\": 41120,\r\n"
				+ "    \"ticket-number\": \"7896\"\r\n" + "  }]\r\n" + "}";

		return b;

	}

	public static String getPatchDataSkimRCV_MostFields() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-06-21T02:06:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-06-21T02:06:30.000-05:00\",\r\n"
				+ "  \"bay\": \"South Bay - A\",\r\n" + "  \"btu\": \"BTU North\",\r\n"
				+ "  \"departure-date-time\": \"2018-06-21T02:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Driver Joe\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 42500,\r\n"
				+ "  \"holdover\": \"PARTIAL\",\r\n" + "  \"hose-screen\": \"TWO\",\r\n" + "  \"meter\": \"ONE\",\r\n"
				+ "  \"milk-type\": \"OGRFD\",\r\n" + "  \"net-pounds\": 42000,\r\n" + "  \"note\": \"1234567890\",\r\n"
				+ "  \"plant\": {\r\n" + "    \"id\": 1638,\r\n" + "    \"name\": \"DanoneWave - Fort Worth\"\r\n"
				+ "  },\r\n" + "  \"po-number\": \"545454\",\r\n" + "  \"producer\": \"Brody Farms\",\r\n"
				+ "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2019-03-02T02:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"rw\",\r\n" + "  \"reclassify-code\": \"ORGANIC2RBST\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 436,\r\n"
				+ "  \"shipping-date-time\": \"2018-06-21T02:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112233\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"REAR\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"pounds-per-ticket\": 42000,\r\n" + "    \"ticket-number\": \"789689\"\r\n" + "  }],\r\n"
				+ "  \"measurements\": [{\r\n" + "    \"antibiotic\": \"AFLATOXIN\",\r\n"
				+ "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n"
				+ "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataSkimRCV_Export() {

		String b = "{\r\n" + "  \"bay\": \"South Bay - A\",\r\n" + "  \"btu\": \"BTU North\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Driver Joe\",\r\n" + "  \"export-flag\": true,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 42500,\r\n"
				+ "  \"holdover\": \"PARTIAL\",\r\n" + "  \"hose-screen\": \"TWO\",\r\n" + "  \"meter\": \"ONE\",\r\n"
				+ "  \"milk-type\": \"RBF\",\r\n" + "  \"net-pounds\": 42000,\r\n" + "  \"note\": \"1234567890\",\r\n"
				+ "  \"plant\": {\r\n" + "    \"id\": 1638,\r\n" + "    \"name\": \"DanoneWave - Fort Worth\"\r\n"
				+ "  },\r\n" + "  \"producer\": \"Brody Farms\",\r\n" + "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2019-01-08T12:06:30.000-05:00\",\r\n"
				+ "  \"receiver-initials\": \"TC\",\r\n" + "  \"reclassify-code\": \"ORGANIC2RBST\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 436,\r\n"
				+ "  \"state-of-origin\": \"TX\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112233\",\r\n"
				+ "  \"tare-weight-per-scale\": 1000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"REAR\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"pounds-per-ticket\": 42000,\r\n" + "    \"ticket-number\": \"789689\"\r\n" + "  }],\r\n"
				+ "  \"measurements\": [{\r\n" + "    \"antibiotic\": \"AFLATOXIN\",\r\n"
				+ "    \"antibiotic-reading\": 3,\r\n" + "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n"
				+ "    \"coliform\": 33,\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"cryogenic-test\": -0.12333,\r\n" + "    \"dmc\": 2211,\r\n"
				+ "    \"flavor-comment\": \"Taste is fine\",\r\n" + "    \"flavor-issue\": 0,\r\n"
				+ "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"12345678901234567890123456789\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataPutReceiptMinSkim() {

		String b = "{\r\n" + "  \"receive-date-time\": \"2019-01-02T02:06:30.000-06:00\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639\r\n" + "},\r\n" + "\"net-pounds\": 44120,\r\n" + " \"manifests\": [{\r\n"
				+ "    \"ticket-number\": \"7899\"\r\n" + "  }]\r\n" + "}";

		return b;
	}

	public static String getPatchDataPutReceiptMultiSkim() {

		String b = "{\r\n" + "  \"appt-date-time\": \"2018-08-06T02:08:30.000-05:00\",\r\n"
				+ "  \"arrival-date-time\": \"2018-08-06T02:01:30.000-05:00\",\r\n" + "  \"bay\": \"Bay22\",\r\n"
				+ "  \"btu\": \"54\",\r\n" + "  \"departure-date-time\": \"2018-08-06T12:06:30.000-05:00\",\r\n"
				+ "  \"double-tripping\": false,\r\n" + "  \"driver-code\": \"DR12\",\r\n"
				+ "  \"driver-name\": \"Rach\",\r\n" + "  \"export-flag\": false,\r\n"
				+ "  \"gmp-infraction\": \"gmp exceeds\",\r\n" + "  \"gross-pounds\": 2500,\r\n"
				+ "  \"hauler-code\": \"H1\",\r\n" + "  \"holdover\": \"PARTIAL\",\r\n"
				+ "  \"hose-screen\": \"FOUR\",\r\n" + "  \"meter\": \"ONE\",\r\n" + "  \"milk-type\": \"RBF\",\r\n"
				+ "  \"net-pounds\": 48220,\r\n" + "  \"note\": \"1234567890\",\r\n" + "  \"plant\": {\r\n"
				+ "    \"id\": 1639,\r\n" + "    \"name\": \"DanoneWave - Fort Worth\"\r\n" + "  },\r\n"
				+ "  \"po-number\": \"123456789\",\r\n" + "  \"producer\": \"Best Milk EVER!\",\r\n"
				+ "  \"ready-for-settlement\": true,\r\n"
				+ "  \"receive-date-time\": \"2019-01-03T01:06:30.000-06:00\",\r\n"
				+ "  \"receiver-initials\": \"TC\",\r\n" + "  \"reclassify-code\": \"OTHER\",\r\n"
				+ "  \"route-name\": \"R101\",\r\n" + "  \"scale-ticket\": 435476,\r\n"
				+ "  \"shipping-date-time\": \"2018-08-06T01:06:30.000-05:00\",\r\n"
				+ "  \"state-of-origin\": \"WA\",\r\n" + "  \"tanker-last-wash-location\": \"North Plant\",\r\n"
				+ "  \"tanker-number\": \"T101\",\r\n" + "  \"tanker-permit\": \"TX112\",\r\n"
				+ "  \"tare-weight-per-scale\": 41000,\r\n" + "  \"tractor-number\": \"TRC202\",\r\n"
				+ "  \"manifests\": [{\r\n" + "    \"compartment\": \"SINGLE\",\r\n"
				+ "    \"division-number\": \"DIV10022\",\r\n" + "    \"note\": \"Only one compartment\",\r\n"
				+ "    \"pounds-per-ticket\": 42000,\r\n" + "    \"ticket-number\": \"756489\"\r\n" + "  },\r\n"
				+ "  {\r\n" + "    \"compartment\": \"SINGLE\",\r\n" + "    \"division-number\": \"DIV10022\",\r\n"
				+ "    \"note\": \"Supplier unknown\",\r\n" + "    \"pounds-per-ticket\": 2000,\r\n"
				+ "    \"ticket-number\": \"7890\"\r\n" + "  }],\r\n" + "  \"measurements\": [{\r\n"
				+ "    \"antibiotic\": \"AFLATOXIN\",\r\n" + "    \"antibiotic-reading\": 3,\r\n"
				+ "    \"butterfat\": 42.1,\r\n" + "    \"casein\": 12.1,\r\n" + "    \"coliform\": 33,\r\n"
				+ "    \"compartment\": \"SINGLE\",\r\n" + "    \"cryogenic-test\": -0.12333,\r\n"
				+ "    \"dmc\": 2211,\r\n" + "    \"flavor-comment\": \"Taste is fine\",\r\n"
				+ "    \"flavor-issue\": 0,\r\n" + "    \"hr1\": \"PURPLE\",\r\n" + "    \"hr3\":\"WHITE\",\r\n"
				+ "    \"inhibitor-anitbiotic\": false,\r\n" + "    \"lab-temperature\": 41,\r\n"
				+ "    \"lactic-acid\": 22.554,\r\n" + "    \"lactose\": 5.1223,\r\n" + "    \"lpc\": 120000,\r\n"
				+ "    \"mun\": 33.1,\r\n" + "    \"odor-comment\": \"No strong odor\",\r\n"
				+ "    \"odor-issue\": 0,\r\n" + "    \"other-solids\": 22.5,\r\n" + "    \"plc\": 11000,\r\n"
				+ "    \"preliminary-incubation\": 320000,\r\n" + "    \"protein\": 12.5,\r\n"
				+ "    \"ropy-milk-test24\": false,\r\n" + "    \"ropy-milk-test36\": false,\r\n"
				+ "    \"ropy-milk-test48\": false,\r\n" + "    \"sample\": \"Good Sample\",\r\n"
				+ "    \"sediment\": 3,\r\n" + "    \"solids-nonfat\": 5.48,\r\n"
				+ "    \"somatic-cell-count\": 220000,\r\n" + "    \"standard-plate-count\": 100000,\r\n"
				+ "    \"ta\": 0.234234,\r\n" + "    \"temperature\": 43,\r\n" + "    \"test-lab\": \"SUPPLIER\",\r\n"
				+ "    \"tester-initials\": \"TC\",\r\n" + "    \"ticket-sample\": \"LOAD\",\r\n"
				+ "    \"total-solids\": 22.13,\r\n" + "    \"use-for-settlement\": true,\r\n"
				+ "    \"visual-comment\": \"Good\",\r\n" + "    \"visual-issue\": 0\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"butterfat\": 40.1,\r\n" + "    \"solids-nonfat\": 3.348,\r\n" + "    \"protein\": 11.5,\r\n"
				+ "    \"use-for-settlement\": true\r\n" + "    }]\r\n" + "}";

		return b;
	}
}
