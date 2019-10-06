package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class tetrimino  extends TranslatorBlock {

	public tetrimino (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{	
			String Steintyp;
			String Fallposition;
			
			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			Steintyp = translatorBlock.toCode();
			translatorBlock = this.getRequiredTranslatorBlockAtSocket(1);
			Fallposition = translatorBlock.toCode();
			
			translator.addHeaderFile("tetratetris.h");
			//translator.buildVariableName("var");
			translator.addDefinitionCommand("tetratetris tt = tetratetris"+ "();");
			translator.addDefinitionCommand("uint8_t flowRow = 0;\n"
					+ "int8_t moveCol = 0;\n"
					+ "uint8_t rotate = 0;\n"
					+ "uint8_t ranBrck;\n");
			translator.addSetupCommand("tt.strip.begin();\n" + 
			"tt.strip.show();");
			
			
			return "tt.drawBrick(" + Steintyp + ", "+ Fallposition +", moveCol, rotate, bottomDir)" ; 
		}
}
