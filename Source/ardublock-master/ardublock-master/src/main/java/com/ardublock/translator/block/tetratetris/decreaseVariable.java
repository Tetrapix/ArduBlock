package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;
import java.util.ResourceBundle;

//import com.ardublock.translator.block.exception.BlockException;
//import com.ardublock.translator.block.letsgoING.LocalVariableNumberBlock;
public class decreaseVariable extends TranslatorBlock
{
	//private static ResourceBundle uiMessageBundle = ResourceBundle.getBundle("com/ardublock/block/ardublock");
	
	public decreaseVariable(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		TranslatorBlock tb = this.getRequiredTranslatorBlockAtSocket(0);
		//if (!(tb instanceof VariableNumberBlock) && !(tb instanceof LocalVariableNumberBlock) ) {
		//	throw new BlockException(blockId, uiMessageBundle.getString("ardublock.error_msg.number_var_slot"));
		//}
		
		String ret = tb.toCode();
		tb = this.getRequiredTranslatorBlockAtSocket(1);
		
		translator.addSetupCommand(ret + " = 0 ;\n");
		
		ret = "if(" + ret + " > " + tb.toCode() + ")" +
				ret + " = " + ret + " - 1" + " ;\n" +
				"else " + ret + " = 0;\n";
		return ret;
	}

}
