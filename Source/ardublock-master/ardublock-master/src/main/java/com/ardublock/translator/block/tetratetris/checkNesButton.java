package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.DigitalInputBlock;
import com.ardublock.translator.block.NumberBlock;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

/*
public class TinkerButtonBlock extends AbstractTinkerReadDigitalBlock
{

	public TinkerButtonBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
}

*/

public class checkNesButton extends TranslatorBlock
{

	public checkNesButton(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
		//translator.addHeaderFile("TinkerKit.h");
	}
	
	@Override
	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		translator.addHeaderFile("tetratetris.h");
		translator.addHeaderFile("NESpad.h");
		translator.addDefinitionCommand("tetratetris tt = tetratetris"+ "();");
		translator.addDefinitionCommand("byte pressedButton;\n"
				+ "byte lastButton = 0;\n");
		
		TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
		//if (translatorBlock instanceof TinkerInputPortBlock)
		//{
			String desiredButton = translatorBlock.toCode();
			//translator.addDefinitionCommand("TKButton "+  tkButtonName + "(" + translatorBlock.toCode() + ");");
			return "tt.checkNesButton(&lastButton," + desiredButton + " )";
		//}
	}
	
	
}
